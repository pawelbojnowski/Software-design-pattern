package pl.pb.designpattern.builder;


import java.util.UUID;

public class BuilderPattern {

    public static void main(String... arg) {
        Car carBMW = new Car.Builder().setBrand("BMW").setModel("535i").setVIN(UUID.randomUUID().toString()).build();
        System.out.println(carBMW);

        Car carFiat = new Car.Builder().setBrand("Fiat").setModel("125p").setVIN(UUID.randomUUID().toString()).build();
        System.out.println(carFiat);
    }
}
