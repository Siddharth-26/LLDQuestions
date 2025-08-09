package NotificationSDK.client.example;

public class SMShandler implements Handler{
  FormatterFactory formatterFactory = new SMSFormatterFactory();
  Formatter formatter = formatterFactory.createFormatter();
  NotificationClient smsClient = new SMSNotificationClient();
  @Override
  public Request formatMessage(Request request) {
    formatter.format(request);
    return request;
  }

  @Override
  public boolean sendNotification(Request request) {
    return smsClient.sendNotification(request);
  }

  @Override
  public boolean formatAndSend(Request request) {
    this.formatMessage(request);
    return this.sendNotification(request);
  }
}
