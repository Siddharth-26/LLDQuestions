package LLDQuestion.NotificationCenter.repo;

import java.util.concurrent.ConcurrentHashMap;

import LLDQuestion.NotificationCenter.models.ChannelType;
import LLDQuestion.NotificationCenter.models.NotificationChannels;

public class NotificationChannelRepoImpl implements NotificationChannelRepo {
  private ConcurrentHashMap<ChannelType, NotificationChannels> notificationChannels = new ConcurrentHashMap<ChannelType, NotificationChannels>();

  @Override
  public NotificationChannels getNotificationChannel(ChannelType channelType) {
    return notificationChannels.computeIfPresent(channelType, (key, value)->{return value;});
  }

  @Override
  public boolean addNotificationChannel(NotificationChannels notificationChannel) {
    NotificationChannels channel = this.notificationChannels.computeIfAbsent(notificationChannel.getChannelType(), (key)->{
      return notificationChannel;
    });
    if(channel==null){
      return false;
    }
    return true;
  }
}
