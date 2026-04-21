package VendingMachine2;

public class IdleState implements State{
  private VendingMachine vendingMachine;
  public IdleState(VendingMachine vendingMachine){
    this.vendingMachine = vendingMachine;
  }
  @Override
  public State selectItem(String itemId, int count) {
    State state = new AddMoneyState(this.vendingMachine);
    return state;
  }

  @Override
  public State addMoney(int amount) {
    System.out.println("Please select the item and the quantity");
    return this.vendingMachine.getState();
  }

  @Override
  public State dispenseMoney() {
    System.out.println("Please select the item and the quantity");
    return this.vendingMachine.getState();
  }

  @Override
  public State dispenseItem() {
    System.out.println("Please select the item and the quantity");
    return this.vendingMachine.getState();
  }

  @Override
  public State cancelTransaction() {
    System.out.println("Please select the item and the quantity");
    return this.vendingMachine.getState();
  }
}
