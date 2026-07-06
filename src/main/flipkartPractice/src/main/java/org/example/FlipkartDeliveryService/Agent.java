package org.example.FlipkartDeliveryService;

public class Agent {
  String pincode;
  String agentName;
  public Agent(String pincode, String agentName) {
    this.pincode = pincode;
    this.agentName = agentName;
  }
  public String getPincode() {
    return pincode;
  }
  public String getAgentName() {
    return agentName;
  }

}
