package NotificationSDK.client.example;

import java.util.HashMap;

public class OrchestrationService {
  Configuration config;
  HashMap<String,Handler> channelHandler;
  HandlerBuilder handlerBuilder = new HandlerBuilder();
  public OrchestrationService(Configuration config){
    this.config = config;
    this.channelHandler = handlerBuilder.buildMap(config.getEnabledChannels());
  }

  public void sendRequest(Request request){
    String channel = request.getChannel();
    Handler handler = channelHandler.get(channel);
    handler.formatAndSend(request);
  }
}
