package pl.pb.designpattern.prototyp;

public class PoliceCar extends Car {

    @Override
    public String toString() {
        return "PoliceCar[@" + Integer.toHexString(hashCode()) + "]{" +
                "VIN='" + VIN + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", options=" + options.size() +
                '}';
    }
}
