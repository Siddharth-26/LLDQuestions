package VendingMachine.states;

import VendingMachine.State;
import VendingMachine.VendinMachine;

public class DispensingState implements State {
  private VendinMachine vendinMachine;
  private int extraAmount;
  public DispensingState(VendinMachine vendinMachine, int extraAmount) {
    this.vendinMachine = vendinMachine;
    this.extraAmount = extraAmount;
  }

  @Override
  public String selectItem(int itemId, int count) {
    return "Please collect the dispensed Items and then again make selection to start new transaction";
  }

  @Override
  public String makePayment(int amount) {
    return "Please collect the dispensed Items and then again make selection to start new transaction";
  }

  @Override
  public String cancelTransaction() {
    this.vendinMachine.setState(new CancelTransactionState(this.vendinMachine));
    this.vendinMachine.cancelTransaction();
    return "Please select the item once more to start a new transaction";
  }

  @Override
  public String dispense() {
    return "Please collect the items and extra cash from the dispenser";
  }
}
