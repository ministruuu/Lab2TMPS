package Bridge.Buildings;


import Bridge.Brand;
import Bridge.Building;

public class СountryHouse extends Building {
    public СountryHouse(Brand brand) {
        super(brand);
    }

    @Override
    public void getType() {
        System.out.println("Сountry House");
    }
}
