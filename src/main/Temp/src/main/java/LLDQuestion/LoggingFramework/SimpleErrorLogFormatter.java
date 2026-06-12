package LLDQuestion.LoggingFramework;

public class SimpleErrorLogFormatter implements LogFormatter{
  @Override
  public String formatMessage(String message) {
    return "[ERROR]" + message;
  }
}
