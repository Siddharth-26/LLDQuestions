package LLDQuestion.VendingMachine;

public class DispenseChangeState implements VendingMachineState {
  private VendingMachine vendingMachine;
  public DispenseChangeState(VendingMachine vendingMachine) {
    this.vendingMachine = vendingMachine;
  }

  @Override
  public VendingMachineState selectProduct(int productId, int quantity) {
    return this;
  }

  @Override
  public VendingMachineState payMoney(int amount) {
    return this;
  }

  @Override
  public VendingMachineState cancelTransaction() {
    return this;
  }

  @Override
  public VendingMachineState dispenseProduct() {
    return this;
  }

  @Override
  public VendingMachineState dispenseChange() {
    System.out.println("Dispensing amount" + this.vendingMachine.getExtraAmount());
    VendingMachineState idleState = new IdleVendingMachineState(this.vendingMachine);
    return idleState;
  }
}
