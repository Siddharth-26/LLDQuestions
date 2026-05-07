package LLDQuestion.LoggingFramework;

public interface LogHandler {
  public void handleMessage(String message);
  public boolean addProcessor(DestinationConfiguration destinationConfiguration);
}
