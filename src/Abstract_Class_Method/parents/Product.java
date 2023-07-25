package Abstract_Class_Method.parents;

public abstract class Product {
    private String name;

    // Constructor default
    public Product() {

    }

    // Constructor dengan parameter
    public Product(String name) {
        this.name = name;
    }

    // Getter name
    public String getName() {
        return name;
    }

    // Setter name
    public void setName(String name) {
        this.name = name;
    }

    // Method abstract
    public abstract void printingInformation();
}