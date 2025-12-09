package NotificationService;


public class PushNotificationStrategy implements NotificationChannelStrategy{
  private Provider provider;
  public PushNotificationStrategy(Provider provider){
    this.provider = provider;
  }
  @Override
  public void sendNotification(String content, User toUser) {
    this.provider.sendNotification(content, toUser);
  }
}
