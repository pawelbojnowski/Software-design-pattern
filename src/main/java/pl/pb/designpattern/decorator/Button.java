package pl.pb.designpattern.decorator;

public class Button implements UIElement {

    private String text;

    public Button(String text) {
        this.text = text;
    }

    public void print() {
        System.out.println("Button : " + text);
    }

    public String getDetails() {
        return "Button > UIElement {text : " + text + "}";
    }
}
