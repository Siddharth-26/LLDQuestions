package LoggingFramework;

import java.time.Instant;

public class LoggerAbstractionImpl implements LoggerAbstraction{
  private LogLevel logLevel;
  private Appender appender;
  @Override
  public void logMessage(String message) {
    this.appender.log(this.composeMessage(message));
  }

  @Override
  public Appender getAppender() {
    return this.appender;
  }

  @Override
  public void addAppender(Appender appender) {
    this.appender = appender;
  }

  @Override
  public void setLogLevel(LogLevel level) {
    this.logLevel = level;
  }
  private String composeMessage(String message){
    String time = Instant.now().toString();
    System.out.println(time+ this.logLevel);
    String level = this.logLevel.toString();
    return  level+':'+time+"->" + message;
  }
}
