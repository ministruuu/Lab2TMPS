package Decorator;

public class RightBracketDecorator extends Decorator{

    public RightBracketDecorator(IPrinter component) {
        super(component);
    }

    @Override
    public void print() {
        super.print();
        System.out.print("]");
    }
}
