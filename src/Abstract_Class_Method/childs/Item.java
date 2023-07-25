package Abstract_Class_Method.childs;

import Abstract_Class_Method.parents.Product;

public class Item extends Product {
    private int price;

    // Constructor default
    public Item() {

    }

    // Constructor dengan parameter
    public Item(String name, int price) {
        super(name);
        this.price = price;
    }

    // Implementasi method abstract dari parent class Product
    @Override
    public void printingInformation() {
        System.out.println("Product Name : " + getName());
        System.out.println("Product Price : " + getPrice());
    }
    
    // Getter price
    public int getPrice() {
        return price;
    }

    // Setter price
    public void setPrice(int price) {
        this.price = price;
    }
}
