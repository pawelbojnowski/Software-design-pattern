package pl.pb.programming.patterns.abstractfactory;

import java.util.UUID;

public class AmbulanceFactory extends AbstractCarFactory {
    @Override
    public Car createCar() {

        Ambulance ambulance = new Ambulance();
        ambulance.setBrand("Mercedes");
        ambulance.setModel("Vito");
        ambulance.setVIN(UUID.randomUUID().toString());
        return ambulance;
    }
}
