package Bridge.Buildings;

import Bridge.Brand;
import Bridge.Building;

public class Appartament extends Building {
    public Appartament(Brand brand) {
        super(brand);
    }

    @Override
    public void getType() {
        System.out.println("Appartament");
    }
}
