package LoggingSystem;

import java.time.LocalDateTime;

public class FatalLoggingMessageComposer implements LoggingMessageComposer{
  @Override
  public String messageComposer(String message) {
    return LocalDateTime.now().toString()+": FATAL : "+message;
  }
}
