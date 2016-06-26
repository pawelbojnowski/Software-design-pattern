package pl.pb.designpattern.abstractfactory;

public class PoliceCar extends Car {

    @Override
    public String toString() {
        return "PoliceCar{" +
                "VIN='" + VIN + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", options=" + options.size() +
                '}';
    }
}
