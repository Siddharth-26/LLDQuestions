package AlertandChannelsFramework;

import AlertandChannelsFramework.dtos.Request;
import AlertandChannelsFramework.dtos.Response;

public interface Alerts {
  public void format(Request request);
  public Response sendMessage(Request request);
}
