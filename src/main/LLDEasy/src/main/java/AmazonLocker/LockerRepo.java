package AmazonLocker;

import java.util.List;

public interface LockerRepo {
  public List<Locker> getLockers();
  public void addLocker(Locker locker);
  public void removeLocker(Locker locker);
  public String occupyLocker(String lockerId, User user, Packet packet);
  public Packet releaseLocker(String lockerId, String password, User user);
}
