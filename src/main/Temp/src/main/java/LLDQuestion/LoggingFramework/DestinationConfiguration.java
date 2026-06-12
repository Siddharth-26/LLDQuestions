package LLDQuestion.LoggingFramework;

public class DestinationConfiguration {
  private String destinationPath;
  private DestinationType type;

  public DestinationConfiguration(String destinationPath, DestinationType type) {
    this.destinationPath = destinationPath;
    this.type = type;
  }

  public String getDestinationPath() {
    return destinationPath;
  }

  public void setDestinationPath(String destinationPath) {
    this.destinationPath = destinationPath;
  }

  public DestinationType getType() {
    return type;
  }

  public void setType(DestinationType type) {
    this.type = type;
  }
}
