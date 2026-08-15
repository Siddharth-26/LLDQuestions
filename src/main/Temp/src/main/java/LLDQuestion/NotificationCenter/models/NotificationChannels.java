package LLDQuestion.NotificationCenter.models;

public interface NotificationChannels {
  public Notification prepareNotification(String eventID, String message);
  public ChannelType getChannelType();
}
