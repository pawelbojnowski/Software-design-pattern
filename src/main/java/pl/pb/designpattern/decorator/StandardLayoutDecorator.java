package pl.pb.designpattern.decorator;

public class StandardLayoutDecorator extends LayoutDecorator {

    public StandardLayoutDecorator(UIElement uiElement) {
        super(uiElement);
    }

    public void print() {
        printExtraContent();
        uiElement.print();
    }

    public String getDetails() {
        return "StandardLayoutDecorator > " + uiElement.getDetails();
    }

    private void printExtraContent() {
        System.out.println("StandardLayoutDecorator > " + uiElement.getDetails());
    }
}
