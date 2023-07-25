package Abstract_Class_Method.childs;

import Abstract_Class_Method.parents.Shape;

public class Triangle extends Shape {
    private double base;
    private double height;

    // Constructor default
    public Triangle() {

    }

    // Constructor dengan parameter
    public Triangle(double base, double height, String color) {
        setColor(color);
        this.base = base;
        this.height = height;
    }

    // Implementasi method abstract dari parent class Shape
    @Override
    public double getArea() {
        double area = 0.5 * base * height;
        return area;
    }
    
}