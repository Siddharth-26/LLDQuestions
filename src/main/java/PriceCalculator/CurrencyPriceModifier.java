package PriceCalculator;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

public class CurrencyPriceModifier extends PriceModifier{
  private Calculator priceCalculatorObject;
  private String currency;

  public CurrencyPriceModifier(Calculator priceCalculatorObject, String currency) {
    this.priceCalculatorObject = priceCalculatorObject;
    this.currency = currency;
  }
  @Override
  public double calculate(List<Item> itemList){
      double calcualtedPrice = this.priceCalculatorObject.calculate(itemList);
      Configuration config = Configuration.getInstance();
      int units = config.getCurrencyMinorUnit(this.currency);
    System.out.println("Currency Price Modifier Modifier" + Double.toString(BigDecimal.valueOf(calcualtedPrice).setScale(units, RoundingMode.DOWN).doubleValue()));
    return BigDecimal.valueOf(calcualtedPrice).setScale(units, RoundingMode.DOWN).doubleValue();
  }
}
