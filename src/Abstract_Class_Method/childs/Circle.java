package Abstract_Class_Method.childs;

import Abstract_Class_Method.parents.Shape;

public class Circle extends Shape {
    private double radius;

    // Constructor default
    public Circle () {

    }

    // Constructor dengan parameter
    public Circle (double radius, String color) {
        setColor(color);
        this.radius = radius;
    }

    // Getter radius
    public double getRadius () {
        return radius;
    }

    // Setter radius
    public void setRadius (double radius) {
        this.radius = radius;
    }

    // Implementasi method abstract dari parent class Shape
    public double getArea () {
        double area = Math.PI * radius * radius;
        return area;
    }
}