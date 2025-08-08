package client;

import java.util.ArrayList;
import java.util.List;

import org.example.Configuration;
import org.example.OrchestrationService;

public class Main {
  public static void main(String[] args){
    Configuration config = Configuration.getInstance();
    List<String> enabledChannels = new ArrayList<>();
    enabledChannels.add("Email");
    enabledChannels.add("SMS");
    enabledChannels.add("Push");
    config.setEnabledChannels(enabledChannels);
    OrchestrationService orchestrationService = new OrchestrationService(config);
  }
}
