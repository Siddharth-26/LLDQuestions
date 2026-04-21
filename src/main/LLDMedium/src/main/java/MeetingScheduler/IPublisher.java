package MeetingScheduler;

import java.util.List;

public interface IPublisher {
  public void notifyUsers(List<User> userList, Booking booking);
}
