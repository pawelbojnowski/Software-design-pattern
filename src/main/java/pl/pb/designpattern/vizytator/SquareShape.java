package pl.pb.designpattern.vizytator;

public class SquareShape implements Shape {
    public String name;

    public SquareShape(String name) {
        this.name = name;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String toString() {
        return "SquareShape{" +
                "name='" + name + '\'' +
                '}';
    }
}
