package Facade;

public class Point implements Element{
    private String pointTitle;

    public Point(String pointTitle) {
        this.pointTitle = pointTitle;
    }

    public String getPointTitle() {
        return pointTitle;
    }

    @Override
    public void add() {
        System.out.printf("%nAdd point %s",pointTitle);
    }
}
