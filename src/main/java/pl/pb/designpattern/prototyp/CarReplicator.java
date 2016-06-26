package pl.pb.designpattern.prototyp;

public class CarReplicator {
    private Car car;

    public CarReplicator(Car car) {
        this.car = car;
    }

    public Car makeCar() {
        return (Car) car.clone();
    }
}
