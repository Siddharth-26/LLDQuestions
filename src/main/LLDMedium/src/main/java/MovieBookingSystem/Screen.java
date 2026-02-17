package MovieBookingSystem;

import java.util.List;

public interface Screen {
  public void setSeatList(List<Seat> seat);
  public List<Seat> getSeatList();
  public Seat getSeat(int index);
}
