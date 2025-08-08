package org.example;

public class EmailFormatter implements Formatter{
  @Override
  public void format(Request request) {
    System.out.println("Formatting Emails");
  }
}
