package LLDQuestion.VendingMachine;

public class PayMoneyVendingMachineState implements VendingMachineState{
  private VendingMachine vendingMachine;
  public PayMoneyVendingMachineState(VendingMachine vendingMachine) {
    this.vendingMachine = vendingMachine;
  }

  @Override
  public VendingMachineState selectProduct(int productId, int quantity) {
    System.out.println("You have already made the selection of products please pay the amount" + this.vendingMachine.getUnpaidAmount());
    return this;
  }

  @Override
  public VendingMachineState payMoney(int amount) {
    int totalUnpaidAmount = this.vendingMachine.getUnpaidAmount();
    if(amount<totalUnpaidAmount){
      System.out.println("Please pay additional" + (totalUnpaidAmount-amount));
      totalUnpaidAmount-=amount;
      this.vendingMachine.setUnpaidAmount(totalUnpaidAmount);
      return this;
    }
    else{
      this.vendingMachine.setExtraAmount(amount-totalUnpaidAmount);
      this.vendingMachine.setUnpaidAmount(0);
      VendingMachineState dispenseProductState = new DispenseProductState(this.vendingMachine);
      return dispenseProductState;
    }
  }

  @Override
  public VendingMachineState cancelTransaction() {
    return null;
  }

  @Override
  public VendingMachineState dispenseProduct() {
    return null;
  }

  @Override
  public VendingMachineState dispenseChange() {
    return null;
  }
}
