package Inheritance;

public class MainApp {
    public static void main(String[] args) {
        // Membuat object dari class Person
        Person person1 = new Person();
        person1.name = "Stalin";
        person1.address = "Bandung";
        // Membuat object dari class Teacher
        Teacher teacher1 = new Teacher();
        teacher1.name = "Asep";
        teacher1.address = "Garut";
        teacher1.subject = "Matematika";
        // Membuat object dari class Doctor
        Doctor doctor1 = new Doctor();
        doctor1.name = "Meli Amelia Putri";
        doctor1.address = "Garut";
        doctor1.specialist = "Dentist";
        // Membuat object dari class Programmer
        Programmer programmer1 = new Programmer();
        programmer1.name = "Ujang";
        programmer1.address = "Bogor";
        programmer1.technology = "Java";

        // Memanggil method greeting() dari class Person
        person1.greeting();
        System.out.println();
        // Memanggil method greeting() dari class Teacher
        teacher1.greeting();
        System.out.println();
        // Memanggil method greeting() dari class Doctor
        doctor1.greeting();
        System.out.println();
        // Memanggil method greeting() dari class Programmer
        programmer1.greeting();
        System.out.println();
    }
}
