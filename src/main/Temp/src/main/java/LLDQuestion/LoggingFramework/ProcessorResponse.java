package LLDQuestion.LoggingFramework;

public class ProcessorResponse {
  private boolean isProcessed;
  private String message;

  public ProcessorResponse(boolean isProcessed, String message) {
    this.isProcessed = isProcessed;
    this.message = message;
  }

  public boolean isProcessed() {
    return isProcessed;
  }

  public void setProcessed(boolean processed) {
    isProcessed = processed;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }
}
