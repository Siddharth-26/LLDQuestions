package org.example;

public class SMSFormatterFactory implements FormatterFactory{
  @Override
  public Formatter createFormatter() {
    return new SMSFormatter();
  }
}
