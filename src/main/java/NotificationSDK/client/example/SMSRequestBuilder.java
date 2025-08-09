package NotificationSDK.client.example;

public class SMSRequestBuilder implements RequestBuilder{
  SMSRequest smsRequest;
  @Override
  public void setSubject(String subject) {
    // This is useless for the SMS message or notification so we leave it..
  }

  @Override
  public void setMessageContent(String content) {
  this.smsRequest.setMessage(content);
  }

  @Override
  public void setDeepLink(String link) {
    // This as well is useless so I am we leave it...
  }

  @Override
  public void reset() {
  this.smsRequest = new SMSRequest();
  }
}
