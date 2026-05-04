package LLDQuestion.VendingMachine;

public interface VendingMachineState {
  public VendingMachineState selectProduct(int productId, int quantity);
  public VendingMachineState payMoney(int amount);
  public VendingMachineState cancelTransaction();
  public VendingMachineState dispenseProduct();
  public VendingMachineState dispenseChange();
}
