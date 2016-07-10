package pl.pb.designpattern.wizytator;

public interface Visitor {
    public void visit(CircleShape circleShape);

    public void visit(SquareShape squareShape);
}
