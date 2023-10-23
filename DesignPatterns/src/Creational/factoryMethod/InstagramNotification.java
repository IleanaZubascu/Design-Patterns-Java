package Creational.factoryMethod;

public class InstagramNotification implements Notification{
    @Override
    public void notifyUser() {
        System.out.println("Sending a instagram notification");
    }
}
