package OOP_Concepts.Polymorphism;

import java.util.ArrayList;
import java.util.List;

//Interface Notification (Parent) --> To Define Common method
//Classes --> EMAIL_Notification, MOBILE_Notification, PUSH_Notification

//Class --> NotificationService
// A class that manages a list of notifications and sends messages to all of them.

//Benefit --> Extensibility and Maintainability

public class NotificationService {

    private List<Notification> notifications = new ArrayList<Notification>();

    public void addNotification(Notification notification) {
        notifications.add(notification);
    }

    public void sendAll(String message) {
        for (Notification notification : notifications) {
            notification.send(message);
        }
    }

    public static void main(String[] args) {

        NotificationService service = new NotificationService();

        // Create different types of notifications
        Notification email = new EmailNotification("Tester@neoSoft.com");
        Notification sms = new MobileNotification(123456789);
        Notification push = new PushNotification("abc123deviceToken");

        // Add notifications to the service
        service.addNotification(email);
        service.addNotification(sms);
        service.addNotification(push);

        // Send the message to all notifications
        service.sendAll("Hello, this is a test message.");
    }
}


class EmailNotification implements Notification{
    private String email_Address;

    public EmailNotification(String email_Address) {
        this.email_Address = email_Address;
    }

    @Override
    public void send(String message) {
        System.out.println("Sending Email to "+email_Address+" :  "+message);
    }

}


class MobileNotification implements Notification{

    private long mobileNo;

    public MobileNotification(long mobileNo) {
        this.mobileNo = mobileNo;
    }
    @Override
    public void send(String message) {
        System.out.println("Sending message to "+mobileNo+": "+message);
    }
}

class PushNotification implements Notification {
    private String deviceToken;

    public PushNotification(String deviceToken) {
        this.deviceToken = deviceToken;
    }

    @Override
    public void send(String message) {
        System.out.println("Sending push notification to device with token " + deviceToken + ": " + message);
    }

}