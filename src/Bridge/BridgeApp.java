package Bridge;

import Bridge.Brands.Dansicons;
import Bridge.Buildings.Appartament;

public class BridgeApp {
    public static void main(String[] args) {
        Building building = new Appartament(new Dansicons());
        building.getDetails();
    }
}
