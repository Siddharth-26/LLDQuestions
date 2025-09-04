package CoffeeVendingMachine.beverages;

public class EspressoBeverageFactory implements BeverageFactory{
  @Override
  public Beverage getBeverage() {
    return new Espresso();
  }
}
