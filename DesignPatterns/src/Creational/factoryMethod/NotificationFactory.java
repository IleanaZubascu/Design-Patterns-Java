package Creational.factoryMethod;

public class NotificationFactory {
    public Notification createNotification(String channel)
    {
        if(channel==null|| channel.isEmpty())
            return null;
        switch (channel)
        {
            case"SMS":
                return new SMSNotification();
            case"EMAIL":
                return new EmailNotification();
            case "INSTRAGRAM":
                return new InstagramNotification();
            default:
                throw new IllegalArgumentException("Unknow channel"+channel);
        }
    }
}
