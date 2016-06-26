package pl.pb.designpattern.builder;

import java.util.UUID;

public class BMWBuilder implements CarBuilder {

    private Car car;

    public BMWBuilder() {
        this.car = new Car();
        car.setVIN(UUID.randomUUID().toString());
    }

    public void setBrand() {
        car.setBrand("BMW");
    }

    public void setModel() {
        car.setModel("5 Series, F10");
    }

    public void addOptions() {
        car.addOptions("M Performance");
        car.addOptions("Individual paint");
    }

    public Car getCar() {
        return car;
    }
}
