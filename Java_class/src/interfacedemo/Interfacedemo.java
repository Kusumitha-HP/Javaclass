package interfacedemo;

// Define the interface
interface SmartDevice {
    void turnOn();
    void turnOff();
    void getStatus();
}

// Implement the interface
class SmartLight implements SmartDevice {

    public void turnOn() {
        System.out.println("Smart light is On");
    }

    public void turnOff() {
        System.out.println("Smart light is off");
    }

    public void getStatus() {
        System.out.println("Smart Light is in standby mode");
    }
}

// Main class
public class Interfacedemo {
    public static void main(String[] args) {
        SmartDevice obj = new SmartLight();
        obj.turnOn();
        obj.turnOff();
        obj.getStatus();
    }
}
