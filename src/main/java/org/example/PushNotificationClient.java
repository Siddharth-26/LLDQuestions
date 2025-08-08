package org.example;

public class PushNotificationClient implements NotificationClient{
  @Override
  public boolean sendNotification(Request request) {
    if(this.simulateFailure()){
      return false;
    }
    System.out.println("Sending push notifications");
    return true;
  }

  @Override
  public boolean simulateFailure() {
    return false;
  }
}
