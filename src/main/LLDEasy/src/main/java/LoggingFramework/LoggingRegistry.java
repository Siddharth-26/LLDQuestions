package LoggingFramework;

import java.util.concurrent.ConcurrentHashMap;

public class LoggingRegistry {
  ConcurrentHashMap<LogType, LogStrategies>  registry;
  public LoggingRegistry(ConcurrentHashMap<LogType, LogStrategies> registry){
    this.registry = registry;
  }
  public LogStrategies getLogStrategy(LogType logType){
    return this.registry.get(logType);
  }
  public void addStrategy(LogType logType, LogStrategies logStrategies){
    this.registry.put(logType, logStrategies);
  }
}
