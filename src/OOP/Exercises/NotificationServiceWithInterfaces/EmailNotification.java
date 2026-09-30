package OOP.Exercises.NotificationServiceWithInterfaces;

public class EmailNotification implements NotificationService{

    @Override
    public void sendNotification(String message, String recipient){
        if(recipient.contains("@")){
            System.out.printf("Email sent to %s\n", recipient);
        } else {
            System.out.println("Invalid email.\n");
        }
    }
}
