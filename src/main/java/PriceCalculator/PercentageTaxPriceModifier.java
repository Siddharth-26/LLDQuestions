package PriceCalculator;

import java.util.List;

public class PercentageTaxPriceModifier extends PriceModifier{
  Calculator priceCalculatorObject;
  int percentage;
  public PercentageTaxPriceModifier(Calculator priceCalculatorObject, int percentage){
    super(priceCalculatorObject);
    this.percentage = percentage;
  }
  @Override
  public double calculate(List<Item> itemList){
    double calculatedPrice = super.calculate(itemList);
    double tax =  (calculatedPrice*(this.percentage))/100;
    calculatedPrice+=tax;
    System.out.println("Percentage Tax Price Modifier" + Double.toString(calculatedPrice));
    return calculatedPrice;
  }
}
