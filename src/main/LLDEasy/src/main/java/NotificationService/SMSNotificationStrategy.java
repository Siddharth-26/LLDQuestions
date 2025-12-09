package NotificationService;

public class SMSNotificationStrategy implements NotificationChannelStrategy{
  private Provider provider;
  public SMSNotificationStrategy(Provider provider){
    this.provider = provider;
  }
  @Override
  public void sendNotification(String content, User toUser) {
    this.provider.sendNotification(content, toUser);
  }
}
