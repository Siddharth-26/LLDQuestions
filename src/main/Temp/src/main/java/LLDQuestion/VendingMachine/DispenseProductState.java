package LLDQuestion.VendingMachine;

public class DispenseProductState implements VendingMachineState {
  private VendingMachine vendingMachine;

  public DispenseProductState(VendingMachine vendingMachine) {
    this.vendingMachine = vendingMachine;
  }

  @Override
  public VendingMachineState selectProduct(int productId, int quantity) {
    System.out.println("You cannot select a product while the machine is in the dispensing state");
    return this;
  }

  @Override
  public VendingMachineState payMoney(int amount) {
    System.out.println("You cannot payMoney while the machine is in dispensing state");
    return this;
  }

  @Override
  public VendingMachineState cancelTransaction() {
    System.out.println("You cannot cancel the transaction while the machine is in the dispensing state");
    return this;
  }

  @Override
  public VendingMachineState dispenseProduct() {
    System.out.println("Dispensing Product.... Sounds....");
    VendingMachineState dispenseChangeState = new DispenseChangeState(this.vendingMachine);
    return dispenseChangeState;
  }

  @Override
  public VendingMachineState dispenseChange() {
    return null;
  }
}
