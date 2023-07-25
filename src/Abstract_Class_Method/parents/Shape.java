package Abstract_Class_Method.parents;

public abstract class Shape {
    private String color;

    // Constructor default
    public Shape() {

    }

    // Getter color
    public String getColor() {
        return color;
    }

    // Setter color
    public void setColor(String color) {
        this.color = color;
    }

    // Abstract method getArea
    public abstract double getArea();
}
