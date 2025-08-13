package AlertandChannelsFramework;

import java.util.List;

import AlertandChannelsFramework.dtos.Request;
import AlertandChannelsFramework.dtos.Response;

public class CriticalAlert implements Alerts{
  @Override
  public void format(Request request) {
// Format message according the the critical alert and this formatting would be placed inthe request itself.
  }

  @Override
  public Response sendMessage(Request request) {
    this.format(request);
    try{
        ChanelTypes primaryChannelType = request.getPrimaryChanel();
        ChanelTypes secondaryChannelType = request.getSecondaryChanel();
        Channel primaryChannel = ChannelRegistry.channelHashMap.get(primaryChannelType);
        Channel secondaryChannel = ChannelRegistry.channelHashMap.get(secondaryChannelType);
        Response response1 = primaryChannel.sendMessage(request);
        Response response2 = secondaryChannel.sendMessage(request);
        if(response1.getStatus()!="202" || response2.getStatus()!="202"){
            throw new Exception(" One of these responses to the primary or secondary channels failed.");
        }
    }
    catch(Exception e){
      Configuration config = Configuration.getInstance();
      List<ChanelTypes> defaultChannel = config.getDefaultCritical();
      // Try for both the default channels; Because either the happy flow has failed or the user never specified both the channels.
      Channel primaryChannel = ChannelRegistry.channelHashMap.get(defaultChannel.get(0));
      Channel secondaryChannel = ChannelRegistry.channelHashMap.get(defaultChannel.get(1));
      Response response1 = primaryChannel.sendMessage(request);
      Response response2 = secondaryChannel.sendMessage(request);
      // We need to note down the out put of both the responses This task can be directly delegated to the Response classes.
      return new Response.Builder().message(response1.getMessage()).build();
    }
    return new Response.Builder().message("Some error occured").build();
  }
}
