public class Email implements NotificationChannel {

    @Override
    public void notify(Message message) {
        System.out.println("[EMAIL] {" +
                message.getMessageType() + "} - " +
                message.getText());
    }
}