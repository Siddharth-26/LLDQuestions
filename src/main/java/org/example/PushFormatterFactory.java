package org.example;

public class PushFormatterFactory implements FormatterFactory{
  @Override
  public Formatter createFormatter() {
    return new PushFormatter();
  }
}
