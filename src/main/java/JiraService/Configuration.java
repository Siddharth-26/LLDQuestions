package JiraService;

import java.util.HashMap;

public class Configuration {
  HashMap<Priority, Integer> prioritySLAHashMap = new HashMap<>();
  private static Configuration instance;
  private Configuration(){
    this.prioritySLAHashMap.put(Priority.LOW, 24);
    this.prioritySLAHashMap.put(Priority.NORMAL, 12);
    this.prioritySLAHashMap.put(Priority.HIGH, 6);
    this.prioritySLAHashMap.put(Priority.URGENT, 1);
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
