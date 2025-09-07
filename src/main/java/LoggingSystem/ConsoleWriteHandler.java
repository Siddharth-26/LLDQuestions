package LoggingSystem;

public class ConsoleWriteHandler implements WriteHandler{
  @Override
  public void writeMessageToDestination(String message) {
    System.out.println("Writing message to console : "+ message);
  }
}
