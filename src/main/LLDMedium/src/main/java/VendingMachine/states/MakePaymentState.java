package VendingMachine.states;

import VendingMachine.State;
import VendingMachine.VendinMachine;

public class MakePaymentState implements State {
  private VendinMachine vendinMachine;
  public MakePaymentState(VendinMachine vendinMachine) {
    this.vendinMachine = vendinMachine;
  }

  @Override
  public String selectItem(int itemId, int count) {
    return "You cannot select the item within the transaction please cancel and try again.";
  }

  @Override
  public String makePayment(int amount) {
    int extraAmount = amount-this.vendinMachine.getAmountTobePaid();
    this.vendinMachine.setPaidAmount(amount);
    if(extraAmount<0){
      int toBePaid = -extraAmount;
      return "Please pay additional amount" + extraAmount+"to continue transaction";
    }
    else{
      this.vendinMachine.setState(new DispensingState(this.vendinMachine, extraAmount));
      this.vendinMachine.dispense();
      return "Please collect items from the dispense box";
    }
  }

  @Override
  public String cancelTransaction() {
    this.vendinMachine.setState(new CancelTransactionState(this.vendinMachine));
    this.vendinMachine.cancelTransaction();
    return "Please select the item once more to start a new transaction";
  }

  @Override
  public String dispense() {
    return "You cannot dispense an item within the transaction please cancel and try again.";
  }
}
