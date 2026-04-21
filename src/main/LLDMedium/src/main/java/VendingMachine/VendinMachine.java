package VendingMachine;

public class VendinMachine {
  private State currentState;
  private Inventory inventory;
  private Display display;
  private Dispenser dispenser;
  private int selectedItemId;
  private int amountTobePaid;
  private int paidAmount;

  public VendinMachine(Inventory inventory, Display display) {
    this.inventory = inventory;
    this.display = display;
  }
  public void selectItem(int itemId, int count){
    String message = this.currentState.selectItem(itemId, count);
    this.display.display(message);
  }
  public void makePayment(int amount){
    String message = this.currentState.makePayment(amount);
    this.display.display(message);
  }
  public void dispense(){
    this.currentState.dispense();
  }

  public void cancelTransaction(){
    this.currentState.cancelTransaction();
    this.display.display(message);
  }

  public void setState(State state){
    this.currentState = state;
  }

  public int getSelectedItemId() {
    return selectedItemId;
  }

  public void setSelectedItemId(Integer selectedItemId) {
    this.selectedItemId = selectedItemId;
  }

  public int getAmountTobePaid() {
    return amountTobePaid;
  }

  public void setAmountTobePaid(int amountTobePaid) {
    this.amountTobePaid = amountTobePaid;
  }

  public Dispenser getDispenser() {
    return dispenser;
  }

  public void setDispenser(Dispenser dispenser) {
    this.dispenser = dispenser;
  }
  public boolean checkInventory(int ItemId, int count){
    return this.inventory.removeItem(ItemId, count);
  }

  public int getPaidAmount() {
    return paidAmount;
  }

  public void setPaidAmount(int paidAmount) {
    this.paidAmount = paidAmount;
  }
}
