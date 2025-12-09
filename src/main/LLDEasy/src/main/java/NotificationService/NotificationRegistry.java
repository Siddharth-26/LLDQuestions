package NotificationService;

import java.util.HashMap;
import java.util.List;

public class NotificationRegistry {
  private HashMap<NotificationTypes,List<NotificationChannelStrategy>> notificationMap;
  public NotificationRegistry(HashMap<NotificationTypes, List<NotificationChannelStrategy>> notificationMap){
    this.notificationMap = notificationMap;
  }
  public void addChannel(NotificationTypes channels, List<NotificationChannelStrategy> sendingStrategy){
    this.notificationMap.put(channels, sendingStrategy);
  }
  public List<NotificationChannelStrategy> getChannels(NotificationTypes channels){
    return this.notificationMap.get(channels);
  }
}
