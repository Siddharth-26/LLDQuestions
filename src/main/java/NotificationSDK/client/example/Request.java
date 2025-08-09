package NotificationSDK.client.example;

public interface Request {
  public void setChannel();
  public void setMessage(String message);
  public String getChannel();
}
