package OOP.Exercises.NotificationServiceWithInterfaces;

public class Main {
    public static void main(String[] args){

        NotificationService emailService = new EmailNotification();
        NotificationService smsService = new SMSNotification();

        NotificationManager.notifyAll(smsService, "Your verification code is 4821", "+551192928459");
        NotificationManager.notifyAll(emailService, "Don't forget our lunch together today!", "random@gmail.com", "guest@gmail.com", "hellogmail.com");
    }
}



