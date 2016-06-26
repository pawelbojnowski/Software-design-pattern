package pl.pb.designpattern.builder;

class Dealer {

    private CarBuilder carBuilder;

    public void buildCar(CarBuilder carBuilder) {
        this.carBuilder = carBuilder;
    }

    public Car getCar() {
        carBuilder.setBrand();
        carBuilder.setModel();
        carBuilder.addOptions();
        return carBuilder.getCar();
    }
}
