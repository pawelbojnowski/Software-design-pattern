package pl.pb.programming.patterns.abstractfactory;

public class AbstractFactoryPattern {

    public static void main(String... arg) {

        PoliceCarFactory policeCarFactory = (PoliceCarFactory) AbstractCarFactory.getFactory(AbstractCarFactory.Type.POLICE);
        Car policeCar = policeCarFactory.createCar();
        System.out.println(policeCar);


        AmbulanceFactory ambulanceFactory = (AmbulanceFactory) AbstractCarFactory.getFactory(AbstractCarFactory.Type.AMBULANCE);
        Car ambulance = ambulanceFactory.createCar();
        System.out.println(ambulance);
    }
}
