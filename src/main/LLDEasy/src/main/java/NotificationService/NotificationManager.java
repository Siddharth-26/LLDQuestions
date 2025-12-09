package NotificationService;

import java.util.List;

public class NotificationManager {
  private NotificationRegistry notificationRegistry;
  private UserRepo userRepo;
  public NotificationManager(NotificationRegistry notificationRegistry, UserRepo userRepo){
    this.notificationRegistry = notificationRegistry;
    this.userRepo = userRepo;
  }
  public void sendMessage(String content, String toUser, NotificationTypes notificationTypes){
    List<NotificationChannelStrategy> list = this.notificationRegistry.getChannels(notificationTypes);
    User user = this.userRepo.getUser(toUser);
    for(NotificationChannelStrategy notificationChannelStrategy: list){
      notificationChannelStrategy.sendNotification(content, user);
    }
  }
}
