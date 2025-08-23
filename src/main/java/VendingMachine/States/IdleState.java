package VendingMachine.States;

public class IdleState implements State {
  VendingMachine context;
  public IdleState(VendingMachine context){
    this.context = context;
  }
  @Override
  public void insertCoin(int coin) {
    System.out.println("Inserted the coin" + coin);
    this.context.changeState(new HasCoinState(this.context));
  }

  @Override
  public void pressButton(int slotNumber) {
    System.out.println("Please insert a coin and then make a sselection");
  }

  @Override
  public void dispense() {
    System.out.println("Not Allowed.");
  }
}
