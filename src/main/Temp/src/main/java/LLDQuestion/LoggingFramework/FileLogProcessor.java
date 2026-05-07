package LLDQuestion.LoggingFramework;

public class FileLogProcessor implements LogProcessor{
  private String destination;
  @Override
  public ProcessorResponse processLog(String message) {
    String finalMessage = message;
    try {
      // We will try to persist the message in the file and if some error is thrown then we return the response.
      // }
      return new ProcessorResponse(true, "Message processed successfully");
    } catch (Exception e) {
      return new ProcessorResponse(false, "Message not processed succesfully");
    }
  }
  public void setDestination(String destination){
    this.destination = destination;
  }
}
