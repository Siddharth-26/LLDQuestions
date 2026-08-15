package LLDQuestion.NotificationCenter.repo;

import java.util.concurrent.ConcurrentHashMap;

import LLDQuestion.NotificationCenter.models.Event;
import LLDQuestion.NotificationCenter.models.EventType;

public class EventsRepoImpl implements EventsRepo {
  private ConcurrentHashMap<EventType, Event> map = new ConcurrentHashMap<>();
  @Override
  public Event getEvent(EventType eventType) {
    Event event = map.computeIfPresent(eventType, (k, v) -> {return v;});
    return event;
  }

  @Override
  public boolean addEvent(Event event) {
    Event createdEvent = map.computeIfAbsent(event.getType(), (key)->{
      return event;
    });
    if(createdEvent!=null){
      return true;
    }
    return false;
  }
}
