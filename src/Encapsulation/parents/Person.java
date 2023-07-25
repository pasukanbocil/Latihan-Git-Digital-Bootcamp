package Encapsulation.parents;

public class Person {
    // field/attribute dari class Person
    private String name;
    private String address;

    // Constructor berparameter
    public Person(String name, String address) {
        super();
        this.name = name;
        this.address = address;
    }

    // Constructor default
    public Person() {
        super();
    }

    // Method greeting() class Person
    public void greeting() {
        System.out.println("Hello, my name is " + name + ".");
        System.out.println("I come from " + address + ".");
    }

    // Getter getName()
    public String getName() {
        return this.name;
    }

    // Setter setName()
    public void setName(String name) {
        this.name = name;
    }

    // Getter getAddress()
    public String getAddress() {
        return this.address;
    }

    // Setter setAddress()
    public void setAddress(String address) {
        this.address = address;
    }
}
