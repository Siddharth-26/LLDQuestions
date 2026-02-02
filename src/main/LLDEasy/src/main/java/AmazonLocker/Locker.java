package AmazonLocker;

import java.util.UUID;

public class Locker {
  private LockerState currState;
  private String lockerId;
  private String password;
  private User user;
  private double size;
  private Packet packet;

  public double getSize() {
    return size;
  }

  public void setSize(double size) {
    this.size = size;
  }

  public Locker(String lockerId){
    this.lockerId = lockerId;
    this.currState = LockerState.EMPTY;
  }
  public boolean checkPassword(String password, User user){
    return this.password.equals(password) && this.user.equals(user);
  }

  public LockerState getCurrState() {
    return currState;
  }

  public void setCurrState(LockerState currState) {
    this.currState = currState;
  }

  public String getLockerId() {
    return lockerId;
  }

  public void setLockerId(String lockerId) {
    this.lockerId = lockerId;
  }

  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }
  public String occupyLocker(User user, Packet packet){
    this.user = user;
    this.currState = LockerState.OCCUPIED;
    String password = UUID.randomUUID().toString();
    this.password = password;
    this.packet = packet;
    return this.password;
  }
  public Packet releaseLocker(String password, User user){
    if(this.password.equals(password) && this.user.equals(user)){
      this.password = null;
      this.user = null;
      this.currState = LockerState.EMPTY;
      Packet value = this.packet;
      return value;
    }
    return null;
  }
}
