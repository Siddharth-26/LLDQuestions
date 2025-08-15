package PriceCalculator;

import java.util.List;

public class PriceModifier implements Calculator{
  private Calculator priceCalculatorObject;
  public PriceModifier(Calculator priceCalculatorObject){
    this.priceCalculatorObject = priceCalculatorObject;
  }
  public PriceModifier(){};
  @Override
  public double calculate(List<Item> itemList) {
    return priceCalculatorObject.calculate(itemList);
  }
}
