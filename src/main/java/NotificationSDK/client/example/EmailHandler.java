package NotificationSDK.client.example;

public class EmailHandler implements Handler{

  FormatterFactory formatterFactory = new EmailFormatterFactory();
  Formatter formatter = formatterFactory.createFormatter();
  NotificationClient emailClient = new EmailNotificationClient();

  @Override
  public Request formatMessage(Request request) {
    formatter.format(request);
    return request;
  }

  @Override
  public boolean sendNotification(Request request) {
    return emailClient.sendNotification(request);
  }

  @Override
  public boolean formatAndSend(Request request) {
    this.formatMessage(request);
    return this.sendNotification(request);
  }

}
