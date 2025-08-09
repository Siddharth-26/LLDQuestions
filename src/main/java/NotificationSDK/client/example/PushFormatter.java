package NotificationSDK.client.example;

public class PushFormatter implements Formatter{
  @Override
  public void format(Request request) {
    System.out.println("Formatting Push notifications");
  }
}
