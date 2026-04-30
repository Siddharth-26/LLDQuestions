package MeetingBookingSystem;

import java.util.Objects;

public class MeetingRooms {
  private String roomId;
  private RoomStatus status;

  public MeetingRooms(String roomId, RoomStatus status) {
    this.roomId = roomId;
    this.status = status;
  }

  public String getRoomId() {
    return roomId;
  }

  public void setRoomId(String roomId) {
    this.roomId = roomId;
  }

  public RoomStatus getStatus() {
    return status;
  }

  public void setStatus(RoomStatus status) {
    this.status = status;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (!(o instanceof MeetingRooms that))
      return false;
    return Objects.equals(roomId, that.roomId) && status == that.status;
  }

  @Override
  public int hashCode() {
    return Objects.hash(roomId, status);
  }
}
