package LLDQuestion.VendingMachine;

public class IdleVendingMachineState implements VendingMachineState{
  private VendingMachine vendingMachine;
  public IdleVendingMachineState(VendingMachine vendingMachine){
    this.vendingMachine = vendingMachine;
  }
  @Override
  public VendingMachineState selectProduct(int productId, int quantity) {
    if(this.vendingMachine.getVendingMachineInventory().reserveInventory(productId, quantity)){
      VendingMachineState payMoneyState = new PayMoneyVendingMachineState(this.vendingMachine);
      this.vendingMachine.setUnpaidAmount(this.vendingMachine.getProductPriceMap().getPrice(productId)*quantity);
      System.out.println("You have successfully made the selection please proceed to pay" + this.vendingMachine.getUnpaidAmount());
      return payMoneyState;
    }
    else{
      System.out.println("The product is not available in this quantity please reduce the quantity or select another product.");
      return this;
    }
  }

  @Override
  public VendingMachineState payMoney(int amount) {
    System.out.println("Please first select the item and then proceed to payment...");
    return this;
  }

  @Override
  public VendingMachineState cancelTransaction() {
    this.vendingMachine.setSelectedProductId(-1);
    this.vendingMachine.setUnpaidAmount(0);
    return this;
  }

  @Override
  public VendingMachineState dispenseProduct() {
    return this;
  }

  @Override
  public VendingMachineState dispenseChange() {
    return this;
  }
}
