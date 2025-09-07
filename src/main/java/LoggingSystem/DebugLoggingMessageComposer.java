package LoggingSystem;

import java.time.LocalDateTime;

public class DebugLoggingMessageComposer implements LoggingMessageComposer{
  @Override
  public String messageComposer(String message) {
    String outputMessage = LocalDateTime.now().toString()+": DEBUG : "+message;
    return outputMessage;
  }
}
