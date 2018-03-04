package pl.pb.designpattern.builder;


import java.util.Arrays;

public class BuilderPattern {

    public static void main(String... arg) {

        Car bmw = new Car.Builder()
                .brand("BMW")
                .model("M5")
                .VIN("VIN123456")
                .options(Arrays.asList("INDIVIDUAL"))
                .build();
        System.out.println(bmw);

        Car fiat = new Car.Builder()
                .brand("FIAT")
                .model("500")
                .VIN("VIN987654")
                .options(Arrays.asList("ECONOMY"))
                .build();
        System.out.println(fiat);
    }
}
