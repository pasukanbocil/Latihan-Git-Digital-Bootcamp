package Encapsulation.childs;

import Encapsulation.parents.Person;

public class Teacher extends Person {
    // field/attribute dari class Teacher
    private String subject;

    // Constructor default
    public Teacher() {
    
    }

    // Constructor berparameter
    public Teacher(String name, String address, String subject) {
        super(name, address);
        this.subject = subject;
    }

    // Method teaching()
    public void teaching () {
        System.out.println("I can teach " + subject + ", So anyone how wants to learn can talk to me.");
    }

    // Method greeting() class Teacher
    public void greeting() {
        // Memanggil method greeting() dari class Person dengan keyword super
        super.greeting();
        System.out.println("My job is a " + subject + " teacher.");
    }

    // Getter getSubject()
    public String getSubject() {
        return this.subject;
    }

    // Setter setSubject()
    public void setSubject(String subject) {
        this.subject = subject;
    }
}
