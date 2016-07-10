package pl.pb.designpattern.wizytator;

import java.util.Arrays;
import java.util.List;

public class VisitorPattern {

    public static void main(String[] args) {

        List<Shape> shapes = Arrays.asList(new CircleShape("Circle Shape 1"), new SquareShape("Square Shape 1"), new CircleShape("Circle Shape 2"));

        Visitor editor = new Editor();
        Visitor shapeManager = new ShapeManager();


        for (Shape shape : shapes) {
            shape.accept(editor);
        }

        for (Shape shape : shapes) {
            shape.accept(shapeManager);
        }
    }
}
