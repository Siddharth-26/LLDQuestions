package NotificationSDK.client.example;

public class PushFormatterFactory implements FormatterFactory{
  @Override
  public Formatter createFormatter() {
    return new PushFormatter();
  }
}
