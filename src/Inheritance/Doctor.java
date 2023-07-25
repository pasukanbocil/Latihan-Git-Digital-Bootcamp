package Inheritance;

public class Doctor extends Person {
    // field/attribute dari class Doctor
    String specialist;

    // Constructor default
    public Doctor() {
    
    }

    // Constructor berparameter
    public Doctor(String name, String address, String specialist) {
        super(name, address);
        this.specialist = specialist;
    }

    // Method surgery()
    void surgery() {
        System.out.println("I can surgery operation patients");
    }

    // Method greeting() class Doctor
    void greeting() {
        // Memanggil method greeting() dari class Person dengan keyword super
        super.greeting();
        System.out.println("My occupation is a " + specialist + " doctor.");
    }
}
