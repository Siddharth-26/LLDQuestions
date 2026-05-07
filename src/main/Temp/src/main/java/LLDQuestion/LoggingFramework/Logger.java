package LLDQuestion.LoggingFramework;

public class Logger {
  LogHandler errorLogHandler;
  public Logger(){
    errorLogHandler = new ErrorLogHandler();
  }
  public void error(String message){
    this.errorLogHandler.handleMessage(message);
  }

  public boolean addDestination(LogType logType, DestinationConfiguration destinationConfiguration){
    if(logType==LogType.ERROR){
      this.errorLogHandler.addProcessor(destinationConfiguration);
      return true;
    }
    return false;
  }

}
