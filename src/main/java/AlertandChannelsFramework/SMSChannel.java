package AlertandChannelsFramework;

import AlertandChannelsFramework.dtos.Request;
import AlertandChannelsFramework.dtos.Response;

public class SMSChannel implements Channel{
  @Override
  public Response sendMessage(Request request) {
    // There might be usage of some third party SMS APIs or SDK that we might need to use...
    // Format the request based on the SMS specs validate the mandatory fields, then send the message via 3rd Party API if incompatible then use adapters etc... And get the response build the response and send it back.
    return new Response.Builder().build();
  }
}
