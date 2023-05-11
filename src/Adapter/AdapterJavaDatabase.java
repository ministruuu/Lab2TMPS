package Adapter;

public class AdapterJavaDatabase implements Database {
    private JavaApp javaApp;
    @Override
    public void insert() {
        javaApp.saveObject();
    }

    @Override
    public void select() {
        javaApp.loadObject();
    }

    @Override
    public void update() {
        javaApp.updateObject();
    }

    @Override
    public void delete() {
        javaApp.removeObject();
    }
}
