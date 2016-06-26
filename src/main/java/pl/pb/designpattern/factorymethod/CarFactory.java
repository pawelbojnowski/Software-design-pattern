package pl.pb.designpattern.factorymethod;

public class CarFactory {

    public enum CarType {POLICE_CAR, AMBULANCE}

    public static Car createCar(CarType carType) {
        Car car = null;

        if (CarType.POLICE_CAR == carType) {
            car = new PoliceCar();
        } else if (CarType.AMBULANCE == carType) {
            car = new PoliceCar();
        }
        // more...

        return car;
    }


}
