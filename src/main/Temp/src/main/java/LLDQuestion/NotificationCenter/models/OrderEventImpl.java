package LLDQuestion.NotificationCenter.models;

import java.util.List;

public class OrderEventImpl implements Event{
  private List<NotificationChannels> prefferedChannels;
  private EventType eventType;
  private String eventId;
  public OrderEventImpl(List<NotificationChannels> prefferedChannels, EventType eventType, String eventId) {
    this.prefferedChannels = prefferedChannels;
    this.eventType = eventType;
    this.eventId = eventId;
  }
  @Override
  public EventType getType() {
    return this.eventType;
  }

  @Override
  public String getMessage(String orderId) {
    return "Your order with orderId : "+ orderId + "has been placed";
  }

  @Override
  public List<NotificationChannels> getPrefferedChannels() {
    return this.prefferedChannels;
  }

  @Override
  public String getEventId() {
    return this.eventId;
  }
}
