package CoffeeVendingMachine.beverages;

public class LatteBeverageFactory implements BeverageFactory{

  @Override
  public Beverage getBeverage() {
    return new Latte();
  }
}
