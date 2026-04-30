package VendingMachine.states;

import VendingMachine.State;
import VendingMachine.VendinMachine;

public class CancelTransactionState implements State {
  private VendinMachine vendingMachine;

  public CancelTransactionState(VendinMachine vendingMachine) {
    this.vendingMachine = vendingMachine;
  }

  @Override
  public String selectItem(int itemId, int count) {
    return "cancellation in progress.";
  }

  @Override
  public String makePayment(int amount) {
    return "cancellation in progress..";
  }

  @Override
  public String cancelTransaction() {
    this.vendingMachine.setAmountTobePaid(0);
    this.vendingMachine.setSelectedItemId(null);
    this.vendingMachine.getDispenser().dispense("Please collect "+this.vendingMachine.getPaidAmount());
    this.vendingMachine.setPaidAmount(0);
    this.vendingMachine.setState(new SelectItemState(this.vendingMachine));
    return "Cancellation of current transaction complete";
  }

  @Override
  public String dispense() {
    return "cancellation in progress.";
  }
}
