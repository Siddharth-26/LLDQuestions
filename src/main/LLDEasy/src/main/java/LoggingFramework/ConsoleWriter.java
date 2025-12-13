package LoggingFramework;


public class ConsoleWriter implements Writers {

  private String destination;

  @Override
  public void writeMessage(String message) {
    System.out.println(message);
  }

  @Override
  public void updateDestination(String destinationAddress) {
    System.out.println("This is a console writer always going to write in the console..");
  }
}
