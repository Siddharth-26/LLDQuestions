package PriceCalculator;

import java.util.List;

public class CouponPriceModifier extends PriceModifier{
  Calculator priceCalculatorObject;
  String coupon;
  public CouponPriceModifier(Calculator priceCalculatorObject, String coupon){
    super(priceCalculatorObject);
    this.coupon = coupon;
  }

  @Override
  public double calculate(List<Item> itemList) {
    double calculatedPrice = super.calculate(itemList);
    Configuration config = Configuration.getInstance();
    if(config.couponCodes.containsKey(this.coupon)){
      calculatedPrice-=config.couponCodes.get(this.coupon);
      System.out.println("Coupon Price Modifier" + Double.toString(calculatedPrice));
      return calculatedPrice;
    }
    System.out.println("Coupon Price Modifier" + Double.toString(calculatedPrice));
    return calculatedPrice;
  }
}
