package VendingMachine.states;

import VendingMachine.State;
import VendingMachine.VendinMachine;

public class SelectItemState implements State {
  private VendinMachine vendinMachine;

  public SelectItemState(VendinMachine vendinMachine) {
    this.vendinMachine = vendinMachine;
  }

  @Override
  public String selectItem(int itemId, int count) {
    if(this.vendinMachine.checkInventory(itemId, count)) {
      this.vendinMachine.setSelectedItemId(itemId);
      this.vendinMachine.setAmountTobePaid(itemId * count);
      this.vendinMachine.setState(new MakePaymentState(this.vendinMachine));
      return "You have selected " + count + "items of type" + itemId;
    }
    else{
      return "This item is not available in this quantity please select other item";
    }
  }

  @Override
  public String makePayment(int amount) {
    return "Please select an item and quantity";
  }

  @Override
  public String cancelTransaction() {
    return "No transaction to cancel please select an Item";
  }

  @Override
  public String dispense() {
    return "Please select an Item and quantity";
  }
}
