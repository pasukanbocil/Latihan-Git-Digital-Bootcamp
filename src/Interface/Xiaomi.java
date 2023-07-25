package Interface;

import Interface.interfaces.Phone;

public class Xiaomi implements Phone {
    private int volume;
    private boolean ispowerOn;

    public Xiaomi() {
        // Default volume
        this.volume = 50;
    }

    // Implementasi semua method abstract dari interface Phone
    public void powerOn() {
        this.ispowerOn = true;
        System.out.println("Handphone menyala...");
        System.out.println("Selamat datang di Xiaomi");
        System.out.println("Android Version 10");
    }

    public void powerOff() {
        ispowerOn = false;
        System.out.println("Mematikan Handphone");
    }

    public void volumeUp() {
        if (ispowerOn) {
            if (this.volume == MAX_VOLUME) {
                System.out.println("Volume sudah maksimal");
                System.out.println("Volume sekarang : " + this.volume + " %");
            } else {
                this.volume += 10;
                System.out.println("Volume sekarang : " + this.volume + " %");
            }
        } else {
            System.out.println("Handphone mati, silahkan hidupkan terlebih dahulu");
        }
    }

    public void volumeDown() {
        if (ispowerOn) {
            if (this.volume == MIN_VOLUME) {
                System.out.println("Volume = " + this.volume + " %");
            } else {
                this.volume -= 10;
                System.out.println("Volume sekarang " + this.volume + " %");
            }
        } else {
            System.out.println("Handphone mati, silahkan hidupkan terlebih dahulu");
        }
    }

    public int getVolume() {
        return this.volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isPowerOn() {
        return ispowerOn;
    }

    public void setPowerOn(boolean ispowerOn) {
        this.ispowerOn = ispowerOn;
    }
}
