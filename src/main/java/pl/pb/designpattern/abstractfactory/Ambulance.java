package pl.pb.programming.patterns.abstractfactory;

public class Ambulance extends Car {

    @Override
    public String toString() {
        return "Ambulance{" +
                "VIN='" + VIN + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", options=" + options.size() +
                '}';
    }

}
