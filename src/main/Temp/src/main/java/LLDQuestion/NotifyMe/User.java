package LLDQuestion.NotifyMe;

import java.util.List;

public class User implements Subscriber{
  private String userName;
  private List<NotificationStrategy> preferredNotificationChannels;
  public User(List<NotificationStrategy> preferredNotificationChannels, String userName){
    this.preferredNotificationChannels =  preferredNotificationChannels;
    this.userName = userName;
  }
  @Override
  public void sendNotification(String message) {
    for(NotificationStrategy notificationStrategy : this.preferredNotificationChannels){
      notificationStrategy.sendNotification(message);
    }
  }
}
