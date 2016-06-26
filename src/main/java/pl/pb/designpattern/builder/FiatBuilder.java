package pl.pb.designpattern.builder;

import java.util.UUID;

public class FiatBuilder implements CarBuilder {

    private Car car;

    public FiatBuilder() {
        this.car = new Car();
        car.setVIN(UUID.randomUUID().toString());
    }

    public void setBrand() {
        car.setBrand("Fiat");
    }

    public void setModel() {
        car.setModel("500");
    }

    public void addOptions() {
        car.addOptions("Retro Style");
        car.addOptions("Family accessory");
    }

    public Car getCar() {
        return car;
    }
}
