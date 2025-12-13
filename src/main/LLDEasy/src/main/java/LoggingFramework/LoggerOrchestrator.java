package LoggingFramework;

public class LoggerOrchestrator {
  private LoggingRegistry loggingRegistry;
  public LoggerOrchestrator(LoggingRegistry loggingRegistry){
    this.loggingRegistry = loggingRegistry;
  }
  public void log(LogType type, String message){
    LogStrategies logStrategies = this.loggingRegistry.getLogStrategy(type);
    logStrategies.log(message);
  }
}
