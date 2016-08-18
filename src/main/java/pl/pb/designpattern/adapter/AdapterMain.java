package pl.pb.designpattern.adapter;

public class AdapterMain {

    public static void main(String[] args) {
        Shape shape = new Adapter();
        shape.draw();
    }
}
