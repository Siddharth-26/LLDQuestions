package org.example;

public class EmailRequestBuilder implements RequestBuilder{

  EmailRequest emailRequest;

  @Override
  public void setSubject(String subject) {
    this.emailRequest.setSubject(subject);
  }

  @Override
  public void setMessageContent(String content) {
  this.emailRequest.setMessage(content);
  }

  @Override
  public void setDeepLink(String link) {
  // This is something we don't wwant to do so we will not do it...
  }

  @Override
  public void reset() {
    this.emailRequest = new EmailRequest();
  }

}
