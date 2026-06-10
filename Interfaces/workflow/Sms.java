public class Sms implements NotificationChannel {

    @Override
    public void notify(Message message) {
        System.out.println("[SMS] {" +
                message.getMessageType() + "} - " +
                message.getText());
    }
}