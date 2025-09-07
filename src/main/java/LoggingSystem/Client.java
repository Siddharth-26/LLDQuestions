package LoggingSystem;

public class Client {
  public static void main(String[] args) {
    WriteHandler handler = new DatabaseWriteHandler("localhost:8080", "sid", "sid123");
    Logger logger = new Logger(handler);
    logger.debug("StackOverflow Exception @ Line 134");
  }
}
