package Decorator;

public abstract class Decorator implements IPrinter {
    IPrinter component;

    public Decorator(IPrinter component) {
        this.component = component;
    }
    @Override
    public void print() {
        component.print();
    }
}
