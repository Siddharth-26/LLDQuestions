package LLDQuestion.LoggingFramework;

public interface LogProcessor {
  // returning
  public ProcessorResponse processLog(String message);
  public void setDestination(String destination);
}
