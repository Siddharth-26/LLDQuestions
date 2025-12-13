package LoggingFramework;


public class FileWriter implements Writers {
  private String destination;

  public FileWriter(String destination){
    this.destination = destination;
  }

  @Override
  public void writeMessage(String message) {
    // Write to the destination with the help of some external API provided by Java or some other third party API..
  }

  @Override
  public void updateDestination(String destinationAddress) {
    this.destination = destinationAddress;
  }
}
