package pl.pb.designpattern.builder;

import java.util.List;

public interface CarBuilder {

    void setVIN();

    void setBrand();

    void setModel();

    Car getCar();

}