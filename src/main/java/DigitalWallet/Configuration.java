package DigitalWallet;

import java.util.HashMap;

public class Configuration {
  private static Configuration instance;
  private HashMap<String, Double> conversionRate;

  private Configuration(HashMap<String, Double> conversionRate){
    this.conversionRate = conversionRate;
  }

  public static Configuration createInstance(HashMap<String, Double> conversionRate){
    if(instance==null){
      return instance;
    }
    else{
      instance = new Configuration(conversionRate);
      return instance;
    }
  }
  public Configuration getInstance(){
    return instance;
  }
  public Double convert(String from , String to, int amount){
    String hash = from+"#"+to;
    return amount*this.conversionRate.get(hash);
  }
}
