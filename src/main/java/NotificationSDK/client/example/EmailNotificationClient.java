package NotificationSDK.client.example;

public class EmailNotificationClient implements NotificationClient{
  @Override
  public boolean sendNotification(Request request) {
    if(this.simulateFailure()){
      return false;
    }
    System.out.println("Sending email notification");
    return true;
  }

  @Override
  public boolean simulateFailure() {
    // Implement failure for the request
    return false;
  }
}
