package OOP.Exercises.NotificationServiceWithInterfaces;

public class NotificationManager {

    public static void notifyAll(NotificationService service, String message, String... recipients){
        for(String recipient : recipients){
            service.sendNotification(message, recipient);
        }
    }
}
