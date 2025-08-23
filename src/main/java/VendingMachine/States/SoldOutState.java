package VendingMachine.States;

public class SoldOutState implements State {

  @Override
  public void insertCoin(int coin) {
    System.out.println("Completely sold out please come later.");
  }

  @Override
  public void pressButton(int slotNumber) {
    System.out.println("Completely sold out please come later.");
  }

  @Override
  public void dispense() {
    System.out.println("Completely sold out please come later.");
  }
}
