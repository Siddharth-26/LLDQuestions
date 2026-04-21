package MeetingScheduler;

public interface User {
  public boolean isAvailable(Slot slot);
  public String getId();
  public int setStatusFree();

  void removeSlot(Slot slot);
}
