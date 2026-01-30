package AmazonLocker;

public class Orchestrator {
  private AssignmentStrategy assignmentStrategy;
  private LockerRepo lockerRepo;
  public Orchestrator(AssignmentStrategy assignmentStrategy, LockerRepo lockerRepo){
    this.lockerRepo = lockerRepo;
    this.assignmentStrategy = assignmentStrategy;
  }
  public Locker getLocker(double area){
    return this.assignmentStrategy.assignLocker(area);
  }
  public String putItem(String lockerId, User user, Packet packet){
    return this.lockerRepo.occupyLocker(lockerId, user, packet);
  }
  public Packet takeItem(String lockerId, String password, User user){
    return this.lockerRepo.releaseLocker(lockerId, password, user);
  }
}

