package Decorator;

public class LeftBracketDecorator extends Decorator {

    public LeftBracketDecorator(IPrinter component) {
        super(component);
    }

    @Override
    public void print() {
        System.out.print("[");
        super.print();
    }
}
