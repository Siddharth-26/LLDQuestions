package LLDQuestion.NotificationCenter.models;

import java.util.List;

public interface Event {
  public EventType getType();
  public String getMessage(String orderId);
  public List<NotificationChannels> getPrefferedChannels();
  public String getEventId();
}
