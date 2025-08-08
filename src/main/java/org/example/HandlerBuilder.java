package org.example;

import java.util.HashMap;
import java.util.List;

public class HandlerBuilder {
  HashMap<String, Handler> registry = new HashMap<>();
  public HashMap<String,Handler> buildMap(List<String> lst){
    registry.put("Email", new EmailHandler());
    registry.put("SMS", new SMShandler());
    return registry;
  }
}
