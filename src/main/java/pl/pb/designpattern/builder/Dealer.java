package pl.pb.designpattern.builder;

/**
 * Created by pawel on 2017-05-27.
 */
public class Dealer {
    private CarBuilder carBuilder;

    public void setCarBuilder(CarBuilder carBuilder) {
        this.carBuilder = carBuilder;
    }

    public Car createCar() {
        carBuilder.setBrand();
        carBuilder.setModel();
        carBuilder.setVIN();
        return carBuilder.getCar();
    }


}
