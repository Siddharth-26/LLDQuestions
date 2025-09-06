package ATMMachine;

import java.util.Optional;
import java.util.OptionalInt;

public interface State {
  public void display();
  public Optional<Integer> getBalance();
  public boolean authenticate(String CardNumber, String pin);
  public OptionalInt withdrawAmount(int amount);
  public OptionalInt depositAmount(int amount);
}
