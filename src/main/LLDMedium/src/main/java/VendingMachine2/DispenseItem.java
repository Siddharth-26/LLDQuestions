package VendingMachine2;

public class DispenseItem implements State{
  VendingMachine vendingMachine;
  public DispenseItem(VendingMachine vendingMachine){
    this.vendingMachine = vendingMachine;
  }
  @Override
  public State selectItem(String itemId, int count) {
    return null;
  }

  @Override
  public State addMoney(int amount) {
    return null;
  }

  @Override
  public State dispenseMoney() {
    return null;
  }

  @Override
  public State dispenseItem() {
    this.vendingMachine.dispenseItem(this.vendingMachine.getCurrentTransaction().getItems());
    this.vendingMachine.getCurrentTransaction().settleTransaction();
    this.vendingMachine.setCurrentTransaction(null);
    State  state = new IdleState(this.vendingMachine);
    return state;
  }

  @Override
  public State cancelTransaction() {
    return null;
  }
}
