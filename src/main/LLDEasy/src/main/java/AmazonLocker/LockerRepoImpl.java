package AmazonLocker;

import java.util.HashMap;
import java.util.List;

public class LockerRepoImpl implements LockerRepo{
  HashMap<String, Locker> lockerMap;
  public LockerRepoImpl(HashMap<String, Locker> lockerMap){
    this.lockerMap = lockerMap;
  }
  @Override
  public List<Locker> getLockers() {
    List<Locker> lockerList = this.lockerMap.values().stream().toList();
    return lockerList;
  }

  @Override
  public void addLocker(Locker locker) {
    this.lockerMap.put(locker.getLockerId(), locker);
  }

  @Override
  public void removeLocker(Locker locker) {
    this.lockerMap.remove(locker);
  }
  public String occupyLocker(String lockerId, User user, Packet packet){
    if(this.lockerMap.containsKey(lockerId)){
      return this.lockerMap.get(lockerId).occupyLocker(user, packet);
    }
    else{
      return null;
    }
  }

  @Override
  public Packet releaseLocker(String lockerId, String password, User user) {
    if(this.lockerMap.containsKey(lockerId)){
      Locker locker = this.lockerMap.get(lockerId);
      return locker.releaseLocker(password, user);
    }
    else{
      return null;
    }
  }

}
