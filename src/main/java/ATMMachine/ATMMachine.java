package ATMMachine;

import java.util.Optional;
import java.util.OptionalInt;

public interface ATMMachine {
  public void display();
  public Optional<Integer> getBalance();
  public int authenticate(String CardNumber, String pin);
  public int withdrawAmount(int amount);
  public int depositAmount(int amount);
  public Transaction getTransaction();
  public void setState(State state);
  public String getUserId();
  public void setUserID(int userID);
}
