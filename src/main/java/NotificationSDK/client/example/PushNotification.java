package NotificationSDK.client.example;

public class PushNotification implements Request{
  String title;
  String message;
  String deepLink;
  String channel;

  public String getChannel() {
    return channel;
  }

  public String getMessage() {
    return message;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getDeepLink() {
    return deepLink;
  }

  public void setDeepLink(String deepLink) {
    this.deepLink = deepLink;
  }

  @Override
  public void setChannel() {
  this.channel = "PUSH";
  }

  @Override
  public void setMessage(String message) {
  this.message = message;
  }
}
