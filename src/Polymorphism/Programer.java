package Polymorphism;

public class Programer extends Person {
    String technology;

    public Programer() {
        super();    
    }

    public Programer(String name, String address, String technology) {
        super(name, address);
        this.technology = technology;
    }

    void hacking() {
        System.out.println("I can hacking a webiste");
    }

    void coding() {
        System.out.println("I can create a application using technology : " + technology + ".");
    }

    void greeting() {
        super.greeting();
        System.out.println("My job is a " + technology + " programer.");
    }
}
