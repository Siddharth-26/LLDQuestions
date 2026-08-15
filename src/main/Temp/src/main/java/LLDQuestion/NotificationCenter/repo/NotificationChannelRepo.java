package LLDQuestion.NotificationCenter.repo;

import LLDQuestion.NotificationCenter.models.ChannelType;
import LLDQuestion.NotificationCenter.models.NotificationChannels;

public interface NotificationChannelRepo {
  public NotificationChannels getNotificationChannel(ChannelType channelType);
  public boolean addNotificationChannel(NotificationChannels channel);
}
