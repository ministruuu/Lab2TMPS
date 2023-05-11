package Facade;

public class Description implements Element{

    private String description;

    public Description(String description) {
        this.description = description;
    }

    @Override
    public void add() {
        System.out.printf("Add description: [%s]",description);
    }
}
