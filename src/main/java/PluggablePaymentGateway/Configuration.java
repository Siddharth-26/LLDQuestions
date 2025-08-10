package PluggablePaymentGateway;

import PluggablePaymentGateway.currencytypes.Currency;

public class Configuration {
  private float USD_INR = 85;
  private float INR_EUR = 100;
  private static Configuration instance;

  public float getINR_EUR() {
    return INR_EUR;
  }

  public float getUSD_INR() {
    return USD_INR;
  }

  private Currency default_currency = Currency.INR;
  private Configuration(){}
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
