package Interface.interfaces;

public interface Phone {
    int MAX_VOLUME = 100;
    int MIN_VOLUME = 0;

    // Method abstract
    void powerOn();
    void powerOff();
    void volumeUp();
    void volumeDown();
}
