package NotificationService;

public interface NotificationChannelStrategy {
  public void sendNotification(String content, User toUser);
}
