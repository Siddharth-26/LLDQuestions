package AlertandChannelsFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Configuration {
  private static Configuration instance;
  private List<ChanelTypes> DefaultCritical = new ArrayList<>();
  private List<ChanelTypes> DefaultInfo = new ArrayList<>();
  private List<ChanelTypes> DeafaultWarning = new ArrayList<>();
  public List<String> successCodes = new ArrayList<>();

  private Configuration(){
    this.DeafaultWarning.add(ChanelTypes.SLACK);
    this.DeafaultWarning.add(ChanelTypes.EMAIl);
    this.DefaultCritical.add(ChanelTypes.SLACK);
    this.DefaultCritical.add(ChanelTypes.EMAIl);
    this.DefaultInfo.add(ChanelTypes.SLACK);
    this.DefaultInfo.add(ChanelTypes.EMAIl);
    String[] temp = {"202", "200", "203"};
    successCodes.addAll(Arrays.asList(temp));
  }

  public List<ChanelTypes> getDefaultCritical() {
    return DefaultCritical;
  }

  public List<ChanelTypes> getDefaultInfo() {
    return DefaultInfo;
  }

  public List<ChanelTypes> getDeafaultWarning() {
    return DeafaultWarning;
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
