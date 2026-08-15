package LLDQuestion.NotificationCenter.repo;

import LLDQuestion.NotificationCenter.models.Event;
import LLDQuestion.NotificationCenter.models.EventType;

public interface EventsRepo {
  public Event getEvent(EventType eventType);
  public boolean addEvent(Event event);

}
