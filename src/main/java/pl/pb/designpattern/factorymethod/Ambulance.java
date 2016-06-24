package pl.pb.programming.patterns.factorymethod;

import java.util.UUID;

public class Ambulance extends Car {

    @Override
    public Car createCar() {
        setBrand("Mercedes");
        setModel("Vito");
        setVIN(UUID.randomUUID().toString());
        return this;
    }

    @Override
    public String toString() {
        return "Ambulance{" +
                "VIN='" + VIN + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", options=" + options.size() +
                '}';
    }
}
