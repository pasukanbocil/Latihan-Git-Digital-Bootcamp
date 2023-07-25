package Abstract_Class_Method;

import Abstract_Class_Method.childs.Circle;

import Abstract_Class_Method.childs.Triangle;

import Abstract_Class_Method.parents.Shape;

public class AppMain2 {
    public static void main(String[] args) {
        // Membuat objek
        Shape lingkaran = new Circle(20, "Biru");
        Shape segitiga = new Triangle(10, 15, "Merah");

        System.out.println("Luas lingkaran berwarna: " + lingkaran.getColor() + " adalah " + lingkaran.getArea());
        System.out.println("Luas segitiga berwarna: " + segitiga.getColor() + " adalah " + segitiga.getArea());
    }
}
