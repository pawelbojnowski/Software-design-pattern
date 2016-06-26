package pl.pb.designpattern.builder;

interface CarBuilder {

    void setBrand();

    void setModel();

    void addOptions();

    Car getCar();
}
