package pl.pb.designpattern.factorymethod;

import java.util.UUID;

public class PoliceCar extends Car {

    @Override
    public Car createCar() {
        setBrand("Opel");
        setModel("Astra");
        setVIN(UUID.randomUUID().toString());
        return this;
    }

    @Override
    public String toString() {
        return "PoliceCar{" +
                "VIN='" + VIN + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", options=" + options.size() +
                '}';
    }
}
