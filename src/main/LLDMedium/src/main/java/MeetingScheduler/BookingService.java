package MeetingScheduler;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class BookingService implements IPublisher{
    private MeetingRoomRepo  meetingRoomRepo;
    private UserRepo userRepo;
    public Booking createBooking(User user, List<User> participant, Instant startTime, Instant endTime, MeetingRoom meetingRoom){
      Slot slot = new Slot(startTime, endTime);
      participant.add(user);
      participant.sort(new Comparator<User>() {
        @Override
        public int compare(User o1, User o2) {
          return o1.getId().compareTo(o2.getId());
        }
      });
      List<User> lockedUsers = new ArrayList<>();
      for(User x: participant)  {
        // this is a synchronised method and what does it do? It basically checks for a user that if that particular user is having this slot in the bookedSlot list
        // If yes then this particular slot is added and then we repeat for other participant.
        // If not then we are going to break out and then release the slot for all the previous particpants as well.
        if(x.isAvailable(slot)){
          lockedUsers.add(x);
        }
        else{
          break;
        }
      }
      if(lockedUsers.size()==participant.size()){
        // Before booking we also need to check for the meeting room availability.
        if(meetingRoom.isAvailable()) {
          Booking booking = new BookingImpl(user, participant, slot, meetingRoom);
          this.notifyUsers(participant, booking);
          return booking;
        }
        else{
          for(User x:lockedUsers){
            x.removeSlot(slot);
          return null;
        }
        }
      }
      else{
        for(User x:lockedUsers){
          x.removeSlot(slot);
        }
      }
        return null;
    }
    public boolean cancelBooking(String bookingId){
      return true;
    }
  @Override
  public void notifyUsers(List<User> userList, Booking booking) {

  }
}
