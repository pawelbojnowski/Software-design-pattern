package pl.pb.designpattern.decorator;

public class DecoratorPattern {

    public static void main(String... arg) {

        Button button = new Button("Java is everywhere");
        button.print();
        System.out.println(button.getDetails());

        System.out.println("------------------------------------------------------------------------");

        UIElement standardLayoutDecorator = new StandardLayoutDecorator(button);
        standardLayoutDecorator.print();
        System.out.println(standardLayoutDecorator.getDetails());

        System.out.println("------------------------------------------------------------------------");

        UIElement animationLayoutDecorator = new AnimationLayoutDecorator(button);
        animationLayoutDecorator.print();
        System.out.println(animationLayoutDecorator.getDetails());

        System.out.println("------------------------------------------------------------------------");
    }
}
