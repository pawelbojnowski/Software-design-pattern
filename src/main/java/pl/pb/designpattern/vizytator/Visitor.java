package pl.pb.designpattern.vizytator;

public interface Visitor {
    void visit(CircleShape circleShape);

    void visit(SquareShape squareShape);
}
