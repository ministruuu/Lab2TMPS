package Decorator;

public class DecoratorApp {
    public static void main(String[] args) {
        IPrinter printer = new QuotesDecorator(new RightBracketDecorator(new LeftBracketDecorator(new Printer("Hello Decorator"))));
        printer.print();
    }
}
