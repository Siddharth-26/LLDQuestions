package VendingMachine;

import java.math.BigInteger;

public class DispenseState implements State {
  private VendingMachine vendingMachine;
  public DispenseState(VendingMachine vendingMachine){
    this.vendingMachine = vendingMachine;
  }
  @Override
  public void payMoney(BigInteger money) {
    System.out.println("Please confirm selection for dispensing Item" + vendingMachine.getSelectedItem());
  }

  @Override
  public void selectItem(Item item) {
    System.out.println("Please confirm selection for dispensing Item" + vendingMachine.getSelectedItem());
  }

  @Override
  public void dispense(

      Item item) {
    System.out.println("The selected Item is" + vendingMachine.getSelectedItem()+"Dispensing Now");
    System.out.println("Swooosh sounds Item getting dispensed.");
    vendingMachine.setAmount(BigInteger.valueOf(0));
    vendingMachine.getInventory().reduceItem(item);
    vendingMachine.setSelectedItem(null);
    vendingMachine.setState(new IdleState(vendingMachine));
  }

  @Override
  public void cancelSelection(Item item) {
    System.out.println("Canceled Selection of this Item" + vendingMachine.getSelectedItem());
    vendingMachine.setState(new SelectionState(vendingMachine));
    vendingMachine.setSelectedItem(null);
    vendingMachine.setAmount(BigInteger.valueOf(0));
  }
}
