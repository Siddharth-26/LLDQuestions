package MovieBookingSystem;

public class Ticket {
  private Seat seat;
  private Show show;
  private String name;
  private String email;

  public Ticket(Seat seat, Show show, String name, String email) {
    this.seat = seat;
    this.show = show;
    this.name = name;
    this.email = email;
  }

  public Seat getSeat() {
    return seat;
  }

  public void setSeat(Seat seat) {
    this.seat = seat;
  }

  public Show getShow() {
    return show;
  }

  public void setShow(Show show) {
    this.show = show;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }
}
