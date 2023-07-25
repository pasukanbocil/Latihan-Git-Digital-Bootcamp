package Interface;

import java.util.Scanner;

import Interface.interfaces.Phone;

public class AppMain {
    public static void main(String[] args) {
        Phone redmiNote9 = new Xiaomi();
        PhoneUser Dicky = new PhoneUser(redmiNote9);

        Dicky.turnOnThePhone();

        Scanner input = new Scanner(System.in);
        String aksi;
        boolean isLooping = true;

        do {
            System.out.println("====Aplikasi interface====");
            System.out.println("1. Nyalakan Handphone");
            System.out.println("2. Matikan Handphone");
            System.out.println("3. Perbesar Volume");
            System.out.println("4. Perkecil Volume");
            System.out.println("0. Keluar");
            System.out.println("=========================");
            System.out.print("Pilih Aksi: ");

            aksi = input.next();

            if (aksi.equalsIgnoreCase("1")) {
                Dicky.turnOnThePhone();
            } else if (aksi.equalsIgnoreCase("2")) {
                Dicky.turnOffThePhone();
            } else if (aksi.equalsIgnoreCase("3")) {
                Dicky.makePhoneLouder();
            } else if (aksi.equalsIgnoreCase("4")) {
                Dicky.makePhoneSilent();
            } else if (aksi.equalsIgnoreCase("0")) {
                isLooping = false;
            } else {
                System.out.println("Aksi yang ada pilih tidak tersedia");
                System.out.println("Silahkan pilih aksi kembali");
            }
        } while (isLooping);
    }
}
