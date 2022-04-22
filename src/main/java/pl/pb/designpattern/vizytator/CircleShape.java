package pl.pb.designpattern.vizytator;

public class CircleShape implements Shape {
    public String name;

    public CircleShape(String name) {
        this.name = name;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String toString() {
        return "CircleShape{" +
                "name='" + name + '\'' +
                '}';
    }
}
