package PriceCalculator;

import java.util.List;

public class FloorPriceModifier extends PriceModifier{
  Calculator priceCalculatorObject;

  public FloorPriceModifier(Calculator priceCalculatorObject){
    super(priceCalculatorObject);
  }

  @Override
  public double calculate(List<Item> itemList) {
    double calculatedPrice =  super.calculate(itemList);
    if(calculatedPrice<Configuration.getInstance().minPrice){
      return Configuration.getInstance().minPrice;
    }
    return calculatedPrice;
  }
}
