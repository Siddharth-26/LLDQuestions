package VendingMachine;

import java.math.BigInteger;

public class SelectionState implements State{
  private VendingMachine vendingMachine;
  public SelectionState(VendingMachine vendingMachine){
    this.vendingMachine = vendingMachine;
  }
  @Override
  public void payMoney( BigInteger money) {
    vendingMachine.setAmount(vendingMachine.getAmount().add(money));
    System.out.println("Please select an Item from the list of items provided" + vendingMachine.getInventory().getInventoryItems());
  }

  @Override
  public void selectItem( Item item) {
    if(vendingMachine.getInventory().checkInventory(item)){
      if(vendingMachine.getAmount().compareTo(item.getAmount())>=0){
    System.out.println("You have selected this Item" + item);
    vendingMachine.setSelectedItem(item);
    vendingMachine.setState(new DispenseState(vendingMachine));
  }
      else{
        System.out.println("Insufficient Funds please add money.");
      }
    }
    else{
      System.out.println("This item is out of stock please select other item or press the cancel button to cancel the transaction.");
    }
  }

  @Override
  public void dispense(

      Item item) {
    System.out.println("Please select from the list of items" + vendingMachine.getInventory().getInventoryItems());
  }

  @Override
  public void cancelSelection( Item item) {
    System.out.println("Please select from the list of items" + vendingMachine.getInventory().getInventoryItems());
    System.out.println("Refunding the money");
    vendingMachine.setState(new IdleState(vendingMachine));
  }
}
