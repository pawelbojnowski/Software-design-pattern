package pl.pb.designpattern.prototyp;

import java.util.UUID;

public class PrototypePattern {
    public static void main(String... arg) {

        PoliceCar policeCarPattern = new PoliceCar();
        policeCarPattern.setVIN(UUID.randomUUID().toString());
        policeCarPattern.setBrand("Opel");
        policeCarPattern.setModel("Astra");

        CarReplicator carReplicator = new CarReplicator(policeCarPattern);
        Car carTmp;
        for (int i = 0; i < 10; i++) {
            carTmp = carReplicator.makeCar();
            System.out.println(carTmp);
        }
    }
}
