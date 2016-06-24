package pl.pb.programming.patterns.abstractfactory;

import java.util.UUID;

public class PoliceCarFactory extends AbstractCarFactory {
    @Override
    public Car createCar() {
        PoliceCar policeCar = new PoliceCar();
        policeCar.setBrand("Opel");
        policeCar.setModel("Astra");
        policeCar.setVIN(UUID.randomUUID().toString());
        return policeCar;
    }
}
