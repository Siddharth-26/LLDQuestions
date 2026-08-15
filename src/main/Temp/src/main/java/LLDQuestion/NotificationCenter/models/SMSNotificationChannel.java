package LLDQuestion.NotificationCenter.models;


public class SMSNotificationChannel implements NotificationChannels{
  private ChannelType channelType;
  public SMSNotificationChannel(ChannelType channelType) {
    this.channelType = channelType;
  }
  @Override
  public Notification prepareNotification(String message, String eventID) {
    return new NotificationImpl(eventID, message);
  }

  @Override
  public ChannelType getChannelType() {
    return this.channelType;
  }
}
