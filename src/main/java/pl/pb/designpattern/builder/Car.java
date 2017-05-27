package pl.pb.designpattern.builder;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private String VIN;
    private String brand;
    private String model;
    private List<String> options;

    public Car() {
        this.options = new ArrayList<String>();
    }

    public String getVIN() {
        return VIN;
    }

    public void setVIN(String VIN) {
        this.VIN = VIN;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public List<String> getOptions() {
        return options;
    }

    public void setOptions(List<String> options) {
        this.options = options;
    }

    public void addOptions(String option) {
        this.options.add(option);
    }

    @Override
    public String toString() {


        return "Car{" +
                "VIN='" + VIN + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", options=" + options.size() +
                '}';
    }

}
