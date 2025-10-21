package LoggingFramework;

public interface Appender {
  public void addAppender(Appender appender);
  public void log(String message);
  public void setOutputdestination(String path);
}
