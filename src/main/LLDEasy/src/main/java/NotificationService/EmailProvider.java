package NotificationService;
// Import AWS EMAIL SERVICE
public class EmailProvider implements Provider{

  @Override
  public void sendNotification(String message, User user) {
  // Use AWS EMAIL SERVICE to send out the emails in case there is a different interface that we need to extend/ implement use that as well....
  }
}
