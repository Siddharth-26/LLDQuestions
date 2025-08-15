package PriceCalculator;

import java.util.List;

public class PercentageDiscountModifier extends PriceModifier{
  Calculator priceCalculatorObject;
  String percentagePromo;

  public PercentageDiscountModifier(Calculator priceCalculatorObject, String percentagePromoCode){
    super(priceCalculatorObject);
    this.percentagePromo = percentagePromoCode;
  }

  @Override
  public double calculate(List<Item> itemList) {
    double calculatedPrice = super.calculate(itemList);
    if(Configuration.getInstance().percentagePromoCode.containsKey(percentagePromo)){
      double discount = calculatedPrice*(Configuration.getInstance().percentagePromoCode.get(this.percentagePromo))/100;
      calculatedPrice-=discount;
      System.out.println("Percentage Discount Modifier" + Double.toString(calculatedPrice));
      return calculatedPrice;
    }
    System.out.println("Percentage Discount Modifier" + Double.toString(calculatedPrice));
    return calculatedPrice;
  }
}
