package VendingMachine;

import java.math.BigInteger;

public class VendingMachine {
  public VendingMachine(Inventory inventory){
    this.state = new IdleState(this);
  }
  private State state;
  private Inventory inventory;
  private Item selectedItem;
  private BigInteger amount;
  public void payMoney(BigInteger money){
    this.state.payMoney( money);
  }
  public void selectItem(Item item){
    this.state.selectItem(item);
  }
  public void dispense(){
    this.state.dispense( this.selectedItem);
  }
  public void cancelSelection(){
    this.state.cancelSelection( this.selectedItem);
  }

  public State getState() {
    return this.state;
  }

  public void setState(State state) {
    this.state = state;
  }

  public Inventory getInventory() {
    return inventory;
  }

  public void setInventory(Inventory inventory) {
    this.inventory = inventory;
  }

  public Item getSelectedItem() {
    return selectedItem;
  }

  public void setSelectedItem(Item selectedItem) {
    this.selectedItem = selectedItem;
  }

  public BigInteger getAmount() {
    return amount;
  }

  public void setAmount(BigInteger amount) {
    this.amount = amount;
  }
}
