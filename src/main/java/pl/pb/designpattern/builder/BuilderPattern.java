package pl.pb.designpattern.builder;


public class BuilderPattern {

    public static void main(String... arg) {

        Dealer dealerBMW = new Dealer();
        dealerBMW.buildCar(new BMWBuilder());
        Car bmw = dealerBMW.getCar();

        System.out.println(bmw);

        Dealer dealerFiat = new Dealer();
        dealerFiat.buildCar(new FiatBuilder());
        Car fiat = dealerFiat.getCar();
        System.out.println(fiat);
    }
}
