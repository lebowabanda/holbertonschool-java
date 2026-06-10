public class Teams implements NotificationChannel {

    @Override
    public void notify(Message message) {
        System.out.println("[TEAMS] {" +
                message.getMessageType() + "} - " +
                message.getText());
    }
}