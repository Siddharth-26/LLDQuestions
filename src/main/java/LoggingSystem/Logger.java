package LoggingSystem;

public class Logger {

  private final WriteHandler handler;

  public Logger(WriteHandler handler){
    this.handler = handler;
  }
  public void debug(String message){
    DebugLoggingMessageComposer debugComposer = new DebugLoggingMessageComposer();
    String outputMessage = debugComposer.messageComposer(message);
      this.handler.writeMessageToDestination(outputMessage);
  }
  public void error(String message){
    ErrorLoggingMessageComposer errorComposer = new ErrorLoggingMessageComposer();
    String outputMessage = errorComposer.messageComposer(message);
      this.handler.writeMessageToDestination(outputMessage);
  }
  public void fatal(String message){
    FatalLoggingMessageComposer fatalComposer = new FatalLoggingMessageComposer();
    String outputMessage = fatalComposer.messageComposer(message);
      this.handler.writeMessageToDestination(outputMessage);
  }
}
