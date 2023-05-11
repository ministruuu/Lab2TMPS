package Facade;

public class Graph {
    private Axis xAxis, yAxis;
    private Description description;
    private Point pointA, pointB;
    private Line line;

    public Graph() {
        this.xAxis = new Axis("X");
        this.yAxis = new Axis("Y");
        this.description = new Description("The graph of a function");
        this.pointA = new Point("A");
        this.pointB = new Point("B");
        this.line = new Line(pointA,pointB);
    }

    public void buildGraph(){
        System.out.println("Plotting...");
        xAxis.add();
        yAxis.add();
        description.add();
        pointA.add();
        pointB.add();
        line.add();
    }
}
