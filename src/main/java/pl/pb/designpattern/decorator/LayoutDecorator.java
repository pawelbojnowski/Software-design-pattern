package pl.pb.designpattern.decorator;

abstract class LayoutDecorator implements UIElement {

    protected UIElement uiElement;

    public LayoutDecorator(UIElement uiElement) {
        this.uiElement = uiElement;
    }
}
