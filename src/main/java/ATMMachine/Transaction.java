package ATMMachine;

import java.util.Optional;
import java.util.OptionalInt;

public interface Transaction {
  public User authenticate(String CardNumber, String pin);
  public Optional<Integer> getBalance(String userID);
  public OptionalInt withdrawAmount(String userID, int amount);
  public OptionalInt depositAmount(String userId, int amount);
}
