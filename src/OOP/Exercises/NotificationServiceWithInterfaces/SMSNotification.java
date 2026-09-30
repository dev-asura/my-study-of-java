package OOP.Exercises.NotificationServiceWithInterfaces;

public class SMSNotification implements NotificationService{

    @Override
    public void sendNotification(String message, String recipient){
        System.out.printf("SMS sent to %s\n", recipient);
    }
}
