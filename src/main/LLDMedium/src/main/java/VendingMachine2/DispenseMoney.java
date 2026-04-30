package VendingMachine2;

public class DispenseMoney implements State{
  VendingMachine vendingMachine;
  public DispenseMoney(VendingMachine vendingMachine){
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
    int extraAmount = this.vendingMachine.getCurrentTransaction().getExtraAmount();
    this.vendingMachine.getCurrentTransaction().settleAmount();
    this.vendingMachine.dispenseMoney(extraAmount);
    State state = new DispenseItem(this.vendingMachine);
    return state;
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
