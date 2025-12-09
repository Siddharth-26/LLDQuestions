package NotificationService;

public class EmailNotificationStrategy implements NotificationChannelStrategy{
  private Provider emailProvider;
  public EmailNotificationStrategy(Provider emailProvider){
    this.emailProvider = emailProvider;
  }

  @Override
  public void sendNotification(String content, User toUser) {
    this.emailProvider.sendNotification(content, toUser);
  }

}
