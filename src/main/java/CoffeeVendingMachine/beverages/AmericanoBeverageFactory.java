package CoffeeVendingMachine.beverages;

public class AmericanoBeverageFactory implements BeverageFactory{
  @Override
  public Beverage getBeverage() {
    return new Americano();
  }
}
