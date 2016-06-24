package pl.pb.programming.patterns.builder;

interface CarBuilder {

    void setBrand();

    void setModel();

    void addOptions();

    Car getCar();
}
