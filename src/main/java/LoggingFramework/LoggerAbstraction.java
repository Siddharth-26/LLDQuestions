package LoggingFramework;

public interface LoggerAbstraction {
  public void logMessage(String message);
  public Appender getAppender();
  public void addAppender(Appender appender);
  public void setLogLevel(LogLevel level);
}
