package Inheritance;

public class Person {
    // field/attribute dari class Person
    String name;
    String address;

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
    void greeting() {
        System.out.println("Hello, my name is " + name + ".");
        System.out.println("I come from " + address + ".");
    }
}
