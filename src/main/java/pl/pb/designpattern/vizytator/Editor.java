package pl.pb.designpattern.vizytator;

public class Editor implements Visitor {
    public void visit(CircleShape circleShape) {
        System.out.println("Editor: " + circleShape);
    }

    public void visit(SquareShape squareShape) {
        System.out.println("Editor: " + squareShape);
    }
}
