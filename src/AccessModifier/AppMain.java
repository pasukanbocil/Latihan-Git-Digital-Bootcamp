package AccessModifier;
import AccessModifier.childs.Doctor;
public class AppMain {
    public static void main(String[] args) {
        // Person person1 = new Person();
        // person1.name = "Hendra";
        // person1.address = "Garut";

        // Teacher teacher1 = new Teacher();
        // teacher1.name = "Budi";
        // teacher1.address = "Bandung";
        // teacher1.subject = "Matematika";


        // object doctor menggunakan constructor default
        Doctor doctor1 = new Doctor();
        doctor1.name = "Elis";
        doctor1.address = "Jakarta";
        doctor1.specialist = "Dentist";

        // object doctor menggunakan constructor parameter
        Doctor doctor2 = new Doctor("Joko", "Tegal", "Cardiologist");



        // Programer programer1 = new Programer();
        // programer1.name = "Rizki";
        // programer1.address = "Surabaya";
        // programer1.technology = "Javascript";

        // person1.greeting();
        // System.out.println();

        // teacher1.greeting();
        // System.out.println();

        doctor1.greeting();
        System.out.println();

        doctor2.greeting();

        // programer1.greeting();

    }
}
