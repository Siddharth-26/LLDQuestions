package ATMMachine;

import java.util.Optional;

public class ATMMachineImpl implements ATMMachine{

  private State state = new IdleState(this);
  private String userId;
  private Transaction transaction;

  public ATMMachineImpl(Transaction transaction){
    this.transaction = transaction;
  }

  public Transaction getTransaction() {
    return transaction;
  }

  public String getUserId() {
    return userId;
  }

  @Override
  public void setUserID(int userID) {
    this.userId = userId;
  }

  @Override
  public void setState(State state) {
    this.state = state;
  }

  @Override
  public void display() {
  this.state.display();
  }

  @Override
  public Optional<Integer> getBalance() {
    return this.state.getBalance();
  }

  @Override
  public int authenticate(String CardNumber, String pin) {
    return 0;
  }

  @Override
  public int withdrawAmount(int amount) {
    return 0;
  }

  @Override
  public int depositAmount(int amount) {
    return 0;
  }
}
