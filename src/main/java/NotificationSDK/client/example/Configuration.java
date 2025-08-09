package NotificationSDK.client.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Configuration {
  static Configuration instance;
  private List<String> enabledChannels = new ArrayList<>();
  private HashMap<String, Float> failureProb = new HashMap<>();
  private String retry;
  private int retryCount;
  private Configuration(){}

  public void insertChannel(String channel){
    enabledChannels.add(channel);
  }

  public List<String> getEnabledChannels() {
    return enabledChannels;
  }

  public void setEnabledChannels(List<String> enabledChannels) {
    this.enabledChannels = enabledChannels;
  }

  public static Configuration getInstance() {
    return instance;
  }

  public static void setInstance(Configuration instance) {
    Configuration.instance = instance;
  }

  public HashMap<String,Float> getFailureProb() {
    return failureProb;
  }

  public void setFailureProb(HashMap<String,Float> failureProb) {
    this.failureProb = failureProb;
  }

  public String getRetry() {
    return retry;
  }

  public void setRetry(String retry) {
    this.retry = retry;
  }

  public int getRetryCount() {
    return retryCount;
  }

  public void setRetryCount(int retryCount) {
    this.retryCount = retryCount;
  }

  public static Configuration getConfiguration(){
    if(instance!=null){
      return instance;
    }
    else{
      Configuration.instance =  new Configuration();
      return Configuration.instance;
    }
  }

}
