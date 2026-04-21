package VendingMachine2;

public class VendingMachine {
  private Transaction currentTransaction;
  private Inventory inventory;
  private State state;
  public VendingMachine(Inventory inventory){
    this.inventory = inventory;
  }
  public void selectItem(String ItemId, int count){
    // Perform the checks for the inventory create a new transaction object... all these are done in the vending machine
    this.state = this.state.selectItem(ItemId, count);
    System.out.println("Please go ahead and add" +this.currentTransaction.getRemainingAmount());
  }
  public void addMoney(int amount){
    // adding to transaction etc.. all these are done here in the vending machine the states are just used for transition and stopping illegal moves...
    this.state = this.state.addMoney(amount);
    this.state = this.state.dispenseMoney();
    this.state = this.state.dispenseItem();
  }
  public void cancelTransaction(){
    this.state = this.state.cancelTransaction();
  }
  public State getState(){
    return this.state;
  }
  public Transaction getCurrentTransaction(){
    return this.currentTransaction;
  }
  public void dispenseMoney(int amount){
    System.out.println("Dispensing Amount" + amount);
  }

  public void dispenseItem(String items) {
  }

  public void setCurrentTransaction(Transaction o) {
    this.currentTransaction = o;
  }
}
