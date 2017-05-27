package pl.pb.designpattern.builder;

import java.util.UUID;

/**
 * Created by pawel on 2017-05-27.
 */
public class CarFiat implements CarBuilder {

    private Car car;

    public CarFiat() {
        this.car = new Car();
    }

    @Override
    public void setVIN() {
        car.setVIN(UUID.randomUUID().toString());
    }

    @Override
    public void setBrand() {
        car.setBrand("Fiat");
    }

    @Override
    public void setModel() {
        car.setModel("125p");
    }

    @Override
    public Car getCar() {
        return this.car;
    }
}
