package org.example;

public class EmailRequest implements Request{
  String channel;
  String message = "Lorem Ipsum....";
  String subject = "";

  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  @Override
  public void setChannel() {
    this.channel = "EMAIL";
  }

  @Override
  public void setMessage(String message) {
  this.message = message;
  }

  public String getChannel() {
    return channel;
  }

  public String getMessage() {
    return message;
  }
}
