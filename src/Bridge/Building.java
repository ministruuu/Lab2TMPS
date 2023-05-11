package Bridge;

public abstract class Building {
    Brand brand;

    public Building(Brand brand) {
        this.brand = brand;
    }

    public abstract void getType();
    public void getDetails(){
        getType();
        brand.setBrand();
    }
}
