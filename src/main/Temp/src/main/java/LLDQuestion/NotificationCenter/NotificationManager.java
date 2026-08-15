package LLDQuestion.NotificationCenter;

import java.util.ArrayList;
import java.util.List;

import LLDQuestion.NotificationCenter.models.Event;
import LLDQuestion.NotificationCenter.models.Notification;
import LLDQuestion.NotificationCenter.models.NotificationChannels;
import LLDQuestion.NotificationCenter.models.Request;
import LLDQuestion.NotificationCenter.repo.EventsRepo;
import LLDQuestion.NotificationCenter.repo.NotificationChannelRepo;

public class NotificationManager {
  private NotificationChannelRepo notificationChannelRepo;
  private EventsRepo eventsRepo;
  public NotificationManager(NotificationChannelRepo notificationChannelRepo, EventsRepo eventsRepo) {
    this.notificationChannelRepo = notificationChannelRepo;
    this.eventsRepo = eventsRepo;
  }
  public List<Notification> sendNotification(Request request){
    Event event = eventsRepo.getEvent(request.getEventType());
    List<NotificationChannels> prefferedChannels = event.getPrefferedChannels();
    String message = event.getMessage(request.getOrderId());
    List<Notification> notifications = new ArrayList<>();
    for(NotificationChannels channel : prefferedChannels){
      notifications.add(channel.prepareNotification(request.getRequestId(), message));
    }
    return notifications;
  }
}
