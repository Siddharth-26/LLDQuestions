package NotificationSDK.client.example;

public class EmailFormatterFactory implements FormatterFactory{

  @Override
  public Formatter createFormatter() {
    return new EmailFormatter();
  }
}
