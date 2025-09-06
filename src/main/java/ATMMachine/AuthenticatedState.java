package ATMMachine;

import java.util.Optional;
import java.util.OptionalInt;

public class AuthenticatedState implements State{
  ATMMachine atmMachine;
  public AuthenticatedState(ATMMachine atmMachine){
    this.atmMachine = atmMachine;
  }
  @Override
  public void display() {
    System.out.println("Please select the operation that you want to do.. from getBalance(), withdraw() and deposit() APIs");
  }

  @Override
  public Optional<Integer> getBalance() {
    Transaction transaction = this.atmMachine.getTransaction();
    this.atmMachine.setState(new IdleState(this.atmMachine));
    Optional<Integer> response = transaction.getBalance(this.atmMachine.getUserId());
    this.atmMachine.display();
    return response;
  }

  @Override
  public boolean authenticate(String CardNumber, String pin) {
    System.out.println("You are already authenticated please select the operation");
    return true;
  }

  @Override
  public OptionalInt withdrawAmount(int amount) {
    Transaction transaction = this.atmMachine.getTransaction();
    this.atmMachine.setState(new IdleState(this.atmMachine));
    OptionalInt response = transaction.withdrawAmount(this.atmMachine.getUserId(), amount);
    this.atmMachine.display();
    return response;
  }

  @Override
  public OptionalInt depositAmount(int amount) {
    Transaction transaction = this.atmMachine.getTransaction();
    this.atmMachine.setState(new IdleState(this.atmMachine));
    OptionalInt response = transaction.depositAmount(this.atmMachine.getUserId(), amount);
    this.atmMachine.display();
    return response;
  }
}
