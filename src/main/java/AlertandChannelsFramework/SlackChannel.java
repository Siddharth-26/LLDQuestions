package AlertandChannelsFramework;

import AlertandChannelsFramework.dtos.Request;
import AlertandChannelsFramework.dtos.Response;

public class SlackChannel implements Channel{
  @Override
  public Response sendMessage(Request request) {
    // There might be usage of some third party Slack APIs or SDK that we might need to use...
    // Format the request based on the Slack specs validate the mandatory fields, then send the message via 3rd Party API if incompatible then use adapters etc... And get the response build the response and send it back.
    return new Response.Builder().build();
  }
}
