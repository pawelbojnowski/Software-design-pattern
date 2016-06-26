package pl.pb.designpattern.factorymethod;

public class FactoryMethodPattern {

    public static void main(String... arg) {

        Car policeCar = CarFactory.createCar(CarFactory.CarType.POLICE_CAR);
        System.out.println(policeCar);

        Car ambulance = CarFactory.createCar(CarFactory.CarType.AMBULANCE);
        System.out.println(ambulance);
    }
}
