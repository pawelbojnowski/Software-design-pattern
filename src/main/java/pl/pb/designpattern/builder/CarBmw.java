package pl.pb.designpattern.builder;

import java.util.UUID;


public class CarBmw implements CarBuilder {

    private Car car;

    public CarBmw() {
        this.car = new Car();
    }

    @Override
    public void setVIN() {
        car.setVIN(UUID.randomUUID().toString());
    }

    @Override
    public void setBrand() {
        car.setBrand("BMW");
    }

    @Override
    public void setModel() {
        car.setModel("535i");
    }

    @Override
    public Car getCar() {
        return this.car;
    }
}
