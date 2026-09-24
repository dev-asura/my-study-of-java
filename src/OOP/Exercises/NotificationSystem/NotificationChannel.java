package OOP.Exercises.NotificationSystem;

public abstract class NotificationChannel implements Sendable{

    private String remittee;
    boolean active;

    NotificationChannel(String remittee, boolean active){
        this.remittee = remittee;
        this.active = active;
    }

}
