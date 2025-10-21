package LoggingFramework;

public class ConsoleAppender implements Appender{
  private Appender childAppender;
  private String outputPath;
  @Override
  public void addAppender(Appender appender) {
    this.childAppender = appender;
  }

  @Override
  public void log(String message) {
    // Since this is console appender we are going to just sysout the method...
    System.out.println(message);
    if(this.childAppender!=null){
    this.childAppender.log(message);
    }
  }

  @Override
  public void setOutputdestination(String path) {
    this.outputPath = path;
  }
}
