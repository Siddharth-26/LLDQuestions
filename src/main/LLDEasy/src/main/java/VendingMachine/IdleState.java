package VendingMachine;

import java.math.BigInteger;

public class IdleState implements State{
  private VendingMachine vendingMachine;
  public IdleState(VendingMachine vendingMachine){
    this.vendingMachine = vendingMachine;
  }
  @Override
  public void payMoney(BigInteger money) {
    vendingMachine.setAmount(money);
    vendingMachine.setState(new SelectionState(vendingMachine));
  }

  @Override
  public void selectItem( Item item) {
    System.out.println("Please pay the amount to select the item");
  }

  @Override
  public void dispense( Item item) {
    System.out.println("Please pay the amount to select the item.");
  }

  @Override
  public void cancelSelection( Item item) {
    System.out.println("Please pay the amount to select the item.");
  }
}
