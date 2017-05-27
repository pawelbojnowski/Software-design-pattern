package pl.pb.designpattern.builder;


import java.util.UUID;

public class BuilderPattern {

    public static void main(String... arg) {

        Dealer dealer = new Dealer();


        dealer.setCarBuilder(new CarBmw());
        Car carBMW = dealer.createCar();
        System.out.println(carBMW);

        dealer.setCarBuilder(new CarFiat());
        Car carFiat = dealer.createCar();
        System.out.println(carFiat);
    }
}
