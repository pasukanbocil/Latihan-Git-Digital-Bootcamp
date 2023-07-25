package Inheritance;

public class Programmer extends Person {
    // field/attribute dari class Programmer
    String technology;

    // Constructor default
    public Programmer() {
    
    }

    // Constructor berparameter
    public Programmer(String name, String address, String technology) {
        super(name, address);
        this.technology = technology;
    }

    // Method hacking()
    void hacking() {
        System.out.println("I can hacking a website");
    }

    // Method coding()
    void coding() {
        System.out.println("I can create a application using technologi: " + technology + ".");
    }

    // Method greeting() class Programmer
    void greeting() {
        // Memanggil method greeting() dari class Person dengan keyword super
        super.greeting();
        System.out.println("My job is a " + technology + " programmer.");
    }
}
