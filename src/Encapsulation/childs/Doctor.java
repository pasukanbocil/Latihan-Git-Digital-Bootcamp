package Encapsulation.childs;
import Encapsulation.parents.Person;
public class Doctor extends Person{
     // field/attribute dari class Doctor
     private String specialist;

     // Constructor default
     public Doctor() {
     
     }
 
     // Constructor berparameter
     public Doctor(String name, String address, String specialist) {
         super(name, address);
         this.specialist = specialist;
     }
 
     // Method surgery()
     public void surgery() {
         System.out.println("I can surgery operation patients");
     }
 
     // Method greeting() class Doctor
     public void greeting() {
         // Memanggil method greeting() dari class Person dengan keyword super
         super.greeting();
         System.out.println("My occupation is a " + specialist + " doctor.");
     }
 
     // Getter getSpecialist()
     public String getSpecialist() {
         return this.specialist;
     }
 
     // Setter setSpecialist()
     public void setSpecialist(String specialist) {
         this.specialist = specialist;
     }
}
