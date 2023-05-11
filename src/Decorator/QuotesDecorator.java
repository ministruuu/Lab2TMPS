package Decorator;

public class QuotesDecorator extends Decorator{

    public QuotesDecorator(IPrinter component) {
        super(component);
    }

    @Override
    public void print() {
        System.out.print("\"");
        super.print();
        System.out.print("\"");
    }
}
