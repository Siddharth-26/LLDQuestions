package VendingMachine.States;

public class DispensingState implements State {
  VendingMachine machine;
  public DispensingState(VendingMachine machine){
    this.machine = machine;
  }
  @Override
  public void insertCoin(int coin) {
    System.out.println("Already dispensing");
  }

  @Override
  public void pressButton(int slotNumber) {
    System.out.println("Already dispensing");
  }

  @Override
  public void dispense() {
    System.out.println("Already dispensing, now complete");
    this.machine.changeState(new IdleState(this.machine));
  }
}
