package LLDQuestion.VendingMachine;

public class DispenseProductState implements VendingMachineState {
  private VendingMachine vendingMachine;

  public DispenseProductState(VendingMachine vendingMachine) {
    this.vendingMachine = vendingMachine;
  }

  @Override
  public VendingMachineState selectProduct(int productId, int quantity) {
    return null;
  }

  @Override
  public VendingMachineState payMoney(int amount) {
    return null;
  }

  @Override
  public VendingMachineState cancelTransaction() {
    return null;
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
