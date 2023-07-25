package Encapsulation.childs;

import Encapsulation.parents.Person;

public class Programer extends Person {
     // field/attribute dari class Programmer
     private String technology;

     // Constructor default
     public Programer() {
     
     }
 
     // Constructor berparameter
     public Programer(String name, String address, String technology) {
         super(name, address);
         this.technology = technology;
     }
 
     // Method hacking()
     public void hacking() {
         System.out.println("I can hacking a website");
     }
 
     // Method coding()
     public void coding() {
         System.out.println("I can create a application using technologi: " + technology + ".");
     }
 
     // Method greeting() class Programmer
     public void greeting() {
         // Memanggil method greeting() dari class Person dengan keyword super
         super.greeting();
         System.out.println("My job is a " + technology + " programmer.");
     }
 
     // Getter getTechnology()
     public String getTechnology() {
         return this.technology;
     }
 
     // Setter setTechnology()
     public void setTechnology(String technology) {
         this.technology = technology;
     }
}
