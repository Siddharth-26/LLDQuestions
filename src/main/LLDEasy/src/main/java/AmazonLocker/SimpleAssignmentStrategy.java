package AmazonLocker;

import java.util.Comparator;
import java.util.List;

public class SimpleAssignmentStrategy implements AssignmentStrategy{
  private LockerRepo lockerRepo;
  public SimpleAssignmentStrategy(LockerRepo lockerRepo){
    this.lockerRepo = lockerRepo;
  }
  @Override
  public Locker assignLocker(double area) {
    List<Locker> lockerList = this.lockerRepo.getLockers();
    lockerList.sort(new Comparator<Locker>() {
      @Override
      public int compare(Locker o1, Locker o2) {
        if(o1.getSize()>o2.getSize()){
          return 1;
        }
        else if(o1.getSize()<o2.getSize()){
          return -1;
        }
        else{
          return 0;
        }
      }
    });
    for(Locker x:lockerList){
      if(x.getSize()>area && x.getCurrState().equals(LockerState.EMPTY)){
        return x;
      }
    }
    return null;
  }
}
