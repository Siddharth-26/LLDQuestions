package VendingMachine.States;

public interface State {
  void insertCoin(int coin);
  void pressButton(int slotNumber);
  void dispense();
}
