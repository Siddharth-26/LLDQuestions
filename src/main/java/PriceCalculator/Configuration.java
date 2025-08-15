package PriceCalculator;

import java.util.HashMap;

public class Configuration {
  HashMap<String, Integer> couponCodes = new HashMap<>();
  HashMap<String, Integer> percentagePromoCode = new HashMap<>();
  HashMap<String, Integer> currencyMinorUnit = new HashMap<>();
  private static Configuration instance;
  int minPrice = 100;

  public HashMap<String,Integer> getCouponCodes() {
    return couponCodes;
  }

  public HashMap<String,Integer> getPercentagePromoCode() {
    return percentagePromoCode;
  }

  public int getCurrencyMinorUnit(String currency) {
    return currencyMinorUnit.get(currency);
  }

  private Configuration(){
    this.couponCodes.put("INDEPENDENCE_DAY_SALE", 100);
    this.couponCodes.put("NEW_CUSTOMER", 50);
    this.percentagePromoCode.put("AUGUST_MADNESS", 10);
    this.currencyMinorUnit.put("USD", 2);
    this.currencyMinorUnit.put("INR", 2);
    this.currencyMinorUnit.put("JPY", 0);
  }

  public static Configuration getInstance(){
    if(instance!=null){
      return instance;
    }
    else{
      instance = new Configuration();
      return instance;
    }
  }
}
