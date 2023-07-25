package Polymorphism;

public class AppMain {
        public static void main(String[] args) {
        // Membuat object dari class Programmer dengan tipe data Person
        Person person1 = new Programer("Stalin", "Garut", "PHP");
        Person person2 = new Teacher("Dede", "Tegal", "Matematika");
        Person person3 = new Doctor("Nisa", "Garut", "Pedistrician");

        sayHello(person1);
        sayHello(person2);
        sayHello(person3);
    }

    // Method sayHello() untuk menyapa setiap object
    static void sayHello(Person person) {
        String message;
        
        if (person instanceof Programer) {
            Programer programmer = (Programer)person;
            message = "Hello, " + programmer.name + ". seorang Programmer " + programmer.technology + ".";
        } else if (person instanceof Teacher) {
            Teacher teacher = (Teacher)person;
            message = "Hello, " + teacher.name + ". seorang Guru " + teacher.subject + ".";
        } else if (person instanceof Doctor) {
            Doctor doctor = (Doctor)person;
            message = "Hello, " + doctor.name + ". seorang Doctor " + doctor.specialist + ".";
        } else {
            message = "Hello, " + person.name + ".";
        }
        System.out.println(message);
    }
}
