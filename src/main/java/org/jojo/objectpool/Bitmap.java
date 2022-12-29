package org.jojo.objectpool;

//concrete reusable
public class Bitmap implements Image {

    private Point2D location;

    private String name;

    public Bitmap(String name) {
        this.name = name;
    }

    @Override
    public void draw() {
        System.out.println("Drawing " + name + " @ " + location);
    }

    @Override
    public Point2D getLocation() {
        return location;
    }

    @Override
    public void setLocation(Point2D location) {
        this.location = location;
    }

    @Override
    public void reset() {
        System.out.println("Bitmap is reset");
        location = null;
    }
}