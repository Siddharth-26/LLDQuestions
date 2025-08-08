package org.example;

public interface Handler {

  public Request formatMessage(Request request);
  public boolean sendNotification(Request request);
  public boolean formatAndSend(Request request);

}
