package Inheritance;

public class MainAppSuperConstructor {
    public static void main(String[] args) {
        // Membuat object class Doctor dengan Constructor default
        Doctor doctor1 = new Doctor();
        doctor1.name = "Meli Amelia Putri";
        doctor1.address = "Garut";
        doctor1.specialist = "Dentist";
        // Membuat object class Doctor dengan Constructor berparameter
        Doctor doctor2 = new Doctor("Azzahra", "Garut", "Cardiologist");

        // Memanggil method greeting() dari class Doctor
        doctor1.greeting();
        System.out.println();
        doctor2.greeting();
    }
}
