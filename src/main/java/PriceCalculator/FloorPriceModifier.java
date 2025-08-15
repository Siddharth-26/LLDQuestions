package PriceCalculator;

import java.util.List;

public class FloorPriceModifier extends PriceModifier{
  Calculator priceCalculatorObject;

  public FloorPriceModifier(Calculator priceCalculatorObject){
    this.priceCalculatorObject = priceCalculatorObject;
  }

  @Override
  public double calculate(List<Item> itemList) {
    double calculatedPrice =  this.priceCalculatorObject.calculate(itemList);
    if(calculatedPrice<Configuration.getInstance().minPrice){
      return Configuration.getInstance().minPrice;
    }
    return calculatedPrice;
  }
}
