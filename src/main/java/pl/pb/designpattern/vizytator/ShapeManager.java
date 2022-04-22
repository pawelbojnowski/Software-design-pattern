package pl.pb.designpattern.vizytator;

public class ShapeManager implements Visitor {
    public void visit(CircleShape circleShape) {
        System.out.println("ShapeManager: " + circleShape);
    }

    public void visit(SquareShape squareShape) {
        System.out.println("ShapeManager: " + squareShape);
    }
}
