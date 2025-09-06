package ATMMachine;

import java.util.Optional;
import java.util.OptionalInt;

public class IdleState implements State{
  ATMMachine atmMachine;
  public IdleState(ATMMachine atmMachine){
    this.atmMachine = atmMachine;
  }
  @Override
  public void display() {
    System.out.println("Please enter your card and enter the PIN.");
  }

  @Override
  public Optional<Integer> getBalance() {
    System.out.println("Please authenticate for that insert the Card and enter your pin.");
    return Optional.empty();
  }

  @Override
  public boolean authenticate(String CardNumber, String pin) {
    Transaction transaction = this.atmMachine.getTransaction();
    User user =  transaction.authenticate(CardNumber, pin);
    if(user!=null){
      this.atmMachine.setState(new AuthenticatedState(this.atmMachine));
      this.atmMachine.display();
      this.atmMachine.setUserID(user.getUserID());
      return true;
    }
    else{
      this.atmMachine.setState(new IncorrectDetails(this.atmMachine));
      return false;
    }
  }

  @Override
  public OptionalInt withdrawAmount(int amount) {
    System.out.println("Please authenticate for that insert the Card and enter your pin.");
    return OptionalInt.empty();
  }

  @Override
  public OptionalInt depositAmount(int amount) {
    System.out.println("Please authenticate for that insert the Card and enter your pin.");
    return OptionalInt.empty();
  }
}
