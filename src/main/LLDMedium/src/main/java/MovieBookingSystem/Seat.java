package MovieBookingSystem;

public class Seat {
  private int Id;
  private Status status;

  public int getId() {
    return Id;
  }

  public void setId(int id) {
    Id = id;
  }

  public Status getStatus() {
    return status;
  }

  public void setStatus(Status status) {
    this.status = status;
  }
  public synchronized boolean tryToReserve(){
    if(this.status==Status.EMPTY){
      this.status = Status.RESERVED;
      return true;
    }
    else{
      return false;
    }
  }
  public synchronized boolean unreserve(){
    this.status = Status.EMPTY;
    return true;
  }
}
