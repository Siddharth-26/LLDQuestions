package NotificationSDK.client;

import java.util.ArrayList;
import java.util.List;

import NotificationSDK.client.example.Configuration;
import NotificationSDK.client.example.OrchestrationService;

public class Main {
  public static void main(String[] args){
    Configuration config = Configuration.getConfiguration();
    List<String> enabledChannels = new ArrayList<>();
    enabledChannels.add("Email");
    enabledChannels.add("SMS");
    enabledChannels.add("Push");
    config.setEnabledChannels(enabledChannels);
    OrchestrationService orchestrationService = new OrchestrationService(config);
  }
}
