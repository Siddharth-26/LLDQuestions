package AlertandChannelsFramework;

import AlertandChannelsFramework.dtos.Request;
import AlertandChannelsFramework.dtos.Response;

public interface Channel {
  public Response sendMessage(Request request);
}
