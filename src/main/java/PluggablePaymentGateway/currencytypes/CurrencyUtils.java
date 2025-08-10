package PluggablePaymentGateway.currencytypes;

import PluggablePaymentGateway.Configuration;

public class CurrencyUtils {
  private static Configuration config =  Configuration.getInstance();
  public static float convertINR_USD(float amount){
    float USD_INR = config.getUSD_INR();
    return amount/USD_INR;
  }
  public static float convertUSD_INR(float amount){
    float USD_INR = config.getUSD_INR();
    return amount*USD_INR;
  }
  public static float convertINR_EUR(float amount){
    float EUR_INR = config.getINR_EUR();
    return amount/EUR_INR;
  }
  public static float convertEUR_INR(float amount){
    float EUR_INR = config.getINR_EUR();
    return amount * EUR_INR;
  }
}
