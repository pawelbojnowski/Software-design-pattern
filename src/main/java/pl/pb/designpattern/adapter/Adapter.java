package pl.pb.designpattern.adapter;

public class Adapter implements Shape {
    public void draw() {
        Line line = new Line();
        line.print();
    }
}
