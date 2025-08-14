package AlertandChannelsFramework;

import java.util.List;

import AlertandChannelsFramework.dtos.Request;
import AlertandChannelsFramework.dtos.Response;

public class INFOAlert implements Alerts {

  @Override
  public void format(Request request) {
    // Format the message based on the INFO Alert type... And then the formatted msg should be put in the request.
  }

  @Override
  public Response sendMessage(Request request) {
    this.format(request);
    try {
      if (request.getPrimaryChanel() != null) {
        ChanelTypes channelType = request.getPrimaryChanel();
        Channel channel = ChannelRegistry.channelHashMap.get(channelType);
        Response response = channel.sendMessage(request);
        if (response.getStatus() != "200" || response.getStatus() != "202") {
          ChanelTypes secondaryChannelType = request.getSecondaryChanel();
          if (secondaryChannelType != null) {
            channel = ChannelRegistry.channelHashMap.get(channelType);
            response = channel.sendMessage(request);
            return response;
          } else {
            throw new Exception("Secondary Channel Attempt Also Failed. Switching to Defaults now..");
          }
        }
        else{
          return response;
        }
      }
      else{
        throw new Exception(" No Primary Channel defined... Switching to Default Channels.");
      }
    } catch (Exception e) {
      List<ChanelTypes> defaultChannels = Configuration.getInstance().getDefaultInfo();
      Channel primaryChannel = ChannelRegistry.channelHashMap.get(defaultChannels.get(0));
      Channel secondaryChannel = ChannelRegistry.channelHashMap.get(defaultChannels.get(1));
      Response response = primaryChannel.sendMessage(request);
      if (response.getStatus() != "200" || response.getStatus() != "202") {
        response = secondaryChannel.sendMessage(request);
        return response;
      } else {
        return response;
      }
    }
  }
}
