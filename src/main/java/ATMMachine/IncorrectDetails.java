package ATMMachine;

import java.util.Optional;
import java.util.OptionalInt;

public class IncorrectDetails implements State {
  ATMMachine atmMachine;
  public IncorrectDetails(ATMMachine atmMachine) {
    this.atmMachine = atmMachine;
  }

  @Override
  public void display() {
    //We might also want to check the incorrect transactions that we are making in case we want to throttle the request or lock the account.
    // I am not going into that but there will be a hashmap which will contain the user checkin times of length 3 ConcurrentHashMap of LinkedList.
    // What we are going to do is that there are going to be a checks about the length of the queue and also about the last checked in times.
    System.out.println("The details are not correct please insert the card again and try once more.");
    this.atmMachine.setState(new IdleState(this.atmMachine));
  }

  @Override
  public Optional<Integer> getBalance() {
    return Optional.empty();
  }

  @Override
  public boolean authenticate(String CardNumber, String pin) {
    return false;
  }

  @Override
  public OptionalInt withdrawAmount(int amount) {
    return OptionalInt.empty();
  }

  @Override
  public OptionalInt depositAmount(int amount) {
    return OptionalInt.empty();
  }
}
