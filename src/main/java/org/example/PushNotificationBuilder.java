package org.example;

public class PushNotificationBuilder implements RequestBuilder{
  PushNotification pushNotification;
  @Override
  public void setSubject(String subject) {
    //Leaving this implementation since not relevant for Push notification
  }

  @Override
  public void setMessageContent(String content) {
  this.pushNotification.setMessage(content);
  }

  @Override
  public void setDeepLink(String link) {
  this.pushNotification.setDeepLink(link);
  }

  @Override
  public void reset() {
  this.pushNotification = new PushNotification();
  }
}
