package pl.pb.designpattern.decorator;

public class AnimationLayoutDecorator extends LayoutDecorator {

    public AnimationLayoutDecorator(UIElement uiElement) {
        super(uiElement);
    }

    public void print() {
        printExtraContent();
        uiElement.print();
    }

    public String getDetails() {
        return "AnimationLayoutDecorator > " + uiElement.getDetails();
    }

    private void printExtraContent() {
        System.out.println("AnimationLayoutDecorator > " + uiElement.getDetails());
        System.out.println("Sorry, there is no any animation here :/ ");
        System.out.println("It is only a command line application :/ ");
    }
}
