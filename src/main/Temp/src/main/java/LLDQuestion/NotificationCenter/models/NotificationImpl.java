package LLDQuestion.NotificationCenter.models;

public class NotificationImpl implements Notification {
  private String eventId;
  private String notificationid;
  private String message;
  public NotificationImpl(String eventId, String message) {
    this.eventId = eventId;
    this.message = message;
  }

  @Override
  public String getEventId() {
    return this.eventId;
  }

  public String getMessage() {
    return this.message;
  }
}
