package NotificationSDK.client.example;

public interface NotificationClient {
  public boolean sendNotification(Request request);
  public boolean simulateFailure();
}
