package pl.pb.programming.patterns.factorymethod;

import java.util.ArrayList;
import java.util.List;

public abstract class Car {
    protected String VIN;
    protected String brand;
    protected String model;
    protected List<String> options;

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

    public abstract Car createCar();

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
