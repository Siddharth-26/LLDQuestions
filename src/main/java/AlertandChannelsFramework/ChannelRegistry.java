package AlertandChannelsFramework;

import java.util.HashMap;
// This class can be completely replaced by the SPI... that Java has so we can develop the channels independently and then just register them in our application.
// I'm making this class as singleton as well this is because once it is initialised at the startup or bootstrap time I don't want to change it. If I want to introduce new Channels then I need to stop the application and then add the new channels.
public class ChannelRegistry {
  public static HashMap<ChanelTypes, Channel> channelHashMap = new HashMap<>();
  private static ChannelRegistry instance;

  public static void setChannelHashMap(ChanelTypes chanelTypes, Channel channel) {
    channelHashMap.put(chanelTypes, channel);
  }

  private ChannelRegistry(){
    channelHashMap.put(ChanelTypes.EMAIl, new EmailChannel());
    channelHashMap.put(ChanelTypes.SLACK, new SlackChannel());
    channelHashMap.put(ChanelTypes.SMS, new SMSChannel());
  }

  public static HashMap<ChanelTypes,Channel> getChannelHashMap() {
    return channelHashMap;
  }

  public static ChannelRegistry getInstance(){
    if(instance!=null){
      return instance;
    }
    else{
      instance = new ChannelRegistry();
      return instance;
    }
  }
}
