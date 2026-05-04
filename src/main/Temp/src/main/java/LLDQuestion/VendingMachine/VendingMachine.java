package LLDQuestion.VendingMachine;

public class VendingMachine {
  private VendingMachineState currentState;
  private VendingMachineInventory vendingMachineInventory;
  private ProductPriceMap productPriceMap;
  private int unpaidAmount;
  private int selectedProductId;
  private int selectedProductQuantity;
  private int extraAmount;

  public VendingMachine(
      VendingMachineState currentState,
      VendingMachineInventory vendingMachineInventory,
      ProductPriceMap productPriceMap) {
    this.currentState = new IdleVendingMachineState(this);
    this.vendingMachineInventory = vendingMachineInventory;
    this.productPriceMap = productPriceMap;
  }
// All these methods are void because they are not returning anything in turn I am printing things to the console.
  public void selectProduct(int productId, int quantity){
    VendingMachineState state = this.currentState.selectProduct(productId, quantity);
    this.currentState = state;

  }
  public void payMoney(int amount){
    VendingMachineState state = this.currentState.payMoney(amount);
    this.currentState = state;
  }
  public void cancelTransaction(){
    this.currentState = this.currentState.cancelTransaction();
  }
  public void dispenseProduct(){
    VendingMachineState nextState = this.currentState.dispenseProduct();
    currentState = nextState;
    this.currentState.dispenseChange();
  }
  public void dispenseChange(){
    VendingMachineState state = this.currentState.dispenseChange();
    this.currentState = state;

  }








  public int getExtraAmount() {
    return extraAmount;
  }

  public void setExtraAmount(int extraAmount) {
    this.extraAmount = extraAmount;
  }

  public ProductPriceMap getProductPriceMap() {
    return productPriceMap;
  }

  public void setProductPriceMap(ProductPriceMap productPriceMap) {
    this.productPriceMap = productPriceMap;
  }

  public VendingMachineState getCurrentState() {
    return currentState;
  }

  public void setCurrentState(VendingMachineState currentState) {
    this.currentState = currentState;
  }

  public VendingMachineInventory getVendingMachineInventory() {
    return vendingMachineInventory;
  }

  public void setVendingMachineInventory(VendingMachineInventory vendingMachineInventory) {
    this.vendingMachineInventory = vendingMachineInventory;
  }

  public int getUnpaidAmount() {
    return unpaidAmount;
  }

  public void setUnpaidAmount(int unpaidAmount) {
    this.unpaidAmount = unpaidAmount;
  }

  public int getSelectedProductId() {
    return selectedProductId;
  }

  public void setSelectedProductId(int selectedProductId) {
    this.selectedProductId = selectedProductId;
  }

  public int getSelectedProductQuantity() {
    return selectedProductQuantity;
  }

  public void setSelectedProductQuantity(int selectedProductQuantity) {
    this.selectedProductQuantity = selectedProductQuantity;
  }
}
