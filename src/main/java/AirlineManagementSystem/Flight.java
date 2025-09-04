package AirlineManagementSystem;

import java.time.LocalDateTime;

public class Flight {
  private String flightId;
  private SeatMap seatMap;
  private int availableSeats = 0;
  private String from;
  private String to;
  private LocalDateTime dateTime;
  private int pricePerSeat;
  public Flight(String flightId, SeatMap seatMap){
    this.seatMap = seatMap;
    this.flightId = flightId;
  }
  // For Now we are having simple system to manage the booking i.e. integers but later we can extend this to List<Seat> or List<List<Seat>>
  public void addSeats(int count){
    this.availableSeats+=count;
  }
  public int getAvailableSeats(){
    return this.availableSeats;
  }

  public String getFlightDetails() {
    return "FlightDetails - {" + "flightId='" + flightId + '\'' + ", seatList=" + seatMap.toString() + ", availableSeats=" +
        availableSeats + '}';
  }
  public int blockSeats(int count) throws Exception {
    if(this.availableSeats<count){
      throw new Exception("There are not enough seats available for the booking please select some other seats");
    }
    else{
      this.availableSeats-=count;
      return count*this.pricePerSeat;
    }
  }
  public boolean unblockSeats(int count){
    this.availableSeats+=count;
    return true;
  }
}
