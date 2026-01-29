package BookMyShow;

public class Seats {
  private String seatId;
  private BookingStatus status;
  public Seats(String seatId){
    this.seatId = seatId;
    this.status = BookingStatus.AVAILABLE;
  }

  public String getSeatId() {
    return seatId;
  }

  public void setSeatId(String seatId) {
    this.seatId = seatId;
  }
  public void holdSeat(){
    this.status = BookingStatus.HOLD;
  }
}
