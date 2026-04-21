package VendingMachine2;

public class AddMoneyState implements State{
  private VendingMachine vendingMachine;
  public AddMoneyState(VendingMachine vendingMachine){
    this.vendingMachine = vendingMachine;
  }
  @Override
  public State selectItem(String itemId, int count) {
    System.out.println("You have already selected the items in case you want to select the items again please cancel this transaction and then make the selection again");
    return this.vendingMachine.getState();
  }

  @Override
  public State addMoney(int amount) {
    if(this.vendingMachine.getCurrentTransaction().isBalanceRemaining()){
      int remainingAmount =  this.vendingMachine.getCurrentTransaction().getRemainingAmount();
      System.out.println("please add "+ remainingAmount);
      return this.vendingMachine.getState();
    }
    else{

    }
  }

  @Override
  public State dispenseMoney() {
    return null;
  }

  @Override
  public State dispenseItem() {
    return null;
  }

  @Override
  public State cancelTransaction() {
    return null;
  }
}
