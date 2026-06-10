public class Slack implements NotificationChannel {

    @Override
    public void notify(Message message) {
        System.out.println("[SLACK] {" +
                message.getMessageType() + "} - " +
                message.getText());
    }
}