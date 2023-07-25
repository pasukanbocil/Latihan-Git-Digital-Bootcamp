package Interface;

import Interface.interfaces.Phone;

public class PhoneUser {
     private Phone phone;

    public PhoneUser(Phone phone) {
        this.phone = phone;
    }

    public void turnOnThePhone() {
        phone.powerOn();
    }

    public void turnOffThePhone() {
        phone.powerOff();
    }

    public void makePhoneLouder() {
        phone.volumeUp();
    }

    public void makePhoneSilent() {
        phone.volumeDown();
    }

    // Getter phone
    public Phone getPhone() {
        return this.phone;
    }

    // Setter phone
    public void setPhone(Phone phone) {
        this.phone = phone;
    }
}
