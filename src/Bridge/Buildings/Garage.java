package Bridge.Buildings;


import Bridge.Brand;
import Bridge.Building;

public class Garage extends Building {
    public Garage(Brand brand) {
        super(brand);
    }

    @Override
    public void getType() {
        System.out.println("Garage");
    }
}
