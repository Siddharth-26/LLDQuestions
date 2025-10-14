package LoggingFramework;

public class Client {
  public static void main(String[] args) {
    LoggerAbstraction loggerAbstraction = new LoggerAbstractionImpl();
    loggerAbstraction.setLogLevel(LogLevel.DEBUG);
    Appender consoleAppender = new ConsoleAppender();
    loggerAbstraction.addAppender(consoleAppender);
    Appender fileAppender = new FileAppender();
    fileAppender.setOutputdestination("/Users/siddharth.tripathi/repo/LLD/src/main/java/LoggingFramework/output.txt");
    consoleAppender.addAppender(fileAppender);
    loggerAbstraction.logMessage("THis is a test message");
  }
}
