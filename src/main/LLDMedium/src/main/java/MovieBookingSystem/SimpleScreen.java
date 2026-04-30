package MovieBookingSystem;

import java.util.List;

public class SimpleScreen implements Screen{
  private List<Seat> seatList;

  public SimpleScreen(List<Seat> seatList) {
    this.seatList = seatList;
  }

  @Override
  public void setSeatList(List<Seat> seatList) {
    this.seatList = seatList;
  }

  @Override
  public List<Seat> getSeatList() {
    return this.seatList;
  }

  @Override
  public Seat getSeat(int index) {
    return this.seatList.get(index);
  }
}
