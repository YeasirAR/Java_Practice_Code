package lecture1;

class Lamp {
    boolean isOn;
    void turnOn() {
        isOn = true;
    }
    void turnOff() {
        isOn = false;
    }

    void displayLightStatus() {

        System.out.println("Light on? " + isOn);
    }
}
class LampDemo {
    public static void main(String[] args) {

        Lamp l1 = new Lamp();
        Lamp l2 = new Lamp();

        l1.turnOn();
        l2.turnOff();

        l1.displayLightStatus();
        l2.displayLightStatus();
    }
}
