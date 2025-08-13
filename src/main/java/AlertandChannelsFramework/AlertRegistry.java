package AlertandChannelsFramework;

import java.util.HashMap;
// This would be called by the user on startup like in the bootstrapping phase.
public class AlertRegistry {
  public static HashMap<AlertTypes, Alerts> alertTypesAlertsHashMap = new HashMap<>();

  public static void addAlert(AlertTypes alertTypes, Alerts alerts) {
    alertTypesAlertsHashMap.put(alertTypes, alerts);
  }

  public static AlertRegistry instance;
  private AlertRegistry(){
    alertTypesAlertsHashMap.put(AlertTypes.INFO, new INFOAlert());
    alertTypesAlertsHashMap.put(AlertTypes.CRITICAL, new CriticalAlert());
  }
  private static AlertRegistry getInstance(){
  if(instance!=null){
    return instance;
  }
  else{
    instance = new AlertRegistry();
    return instance;
  }
  }
}
