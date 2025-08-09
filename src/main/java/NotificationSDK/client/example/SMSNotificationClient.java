package NotificationSDK.client.example;

public class SMSNotificationClient implements NotificationClient{

  @Override
  public boolean sendNotification(Request request) {
    if(this.simulateFailure()){
      return false;
    }
    System.out.println("Sending SMS Notification");
    return true;
  }

  @Override
  public boolean simulateFailure() {
    return false;
  }
}
