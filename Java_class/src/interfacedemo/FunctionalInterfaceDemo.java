package interfacedemo;

// Define the interface
interface NotificationService {
    void notifyUser(String message);
}

// Email notification implementation
class EmailNotification implements NotificationService {
    @Override
    public void notifyUser(String message) {
        System.out.println("Sending Email: " + message);
    }
}

// SMS notification implementation
class SMSNotification implements NotificationService {
    @Override
    public void notifyUser(String message) {
        System.out.println("Sending message: " + message);
    }
}

// Main class
public class FunctionalInterfaceDemo {
    public static void main(String[] args) {
        NotificationService email = new EmailNotification();
        NotificationService sms = new SMSNotification();

        email.notifyUser("Assignment Uploaded");
        sms.notifyUser("Class at 10am");
    }
}
