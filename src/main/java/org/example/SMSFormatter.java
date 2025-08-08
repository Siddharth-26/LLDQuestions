package org.example;

public class SMSFormatter implements Formatter{
  @Override
  public void format(Request request) {
    System.out.println("Formatting SMS");
  }
}
