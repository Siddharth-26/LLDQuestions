package org.example;

public interface RequestBuilder {
  public void setSubject(String subject);
  public void setMessageContent(String content);
  public void setDeepLink(String link);
  public void reset();
}
