package org.example.FlipkartDeliveryService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AgentPincodeRepo {
  HashMap<String,List<Agent>> agentPincodeRepo = new HashMap<String,List<Agent>>();
  public void addAgent(Agent agent){
    if(agentPincodeRepo.containsKey(agent.getPincode())) {
      List<Agent> lst = this.agentPincodeRepo.get(agent.pincode);
      lst.add(agent);
    }
    else{
      List<Agent> lst = new ArrayList<Agent>();
      lst.add(agent);
      this.agentPincodeRepo.put(agent.pincode, lst);
    }
  }
  public List<Agent> getAgents(String pincode){
    if(this.agentPincodeRepo.containsKey(pincode)) {
      return this.agentPincodeRepo.get(pincode);
    }
    return null;
  }
  public List<String> getPincodes(){
    return this.agentPincodeRepo.keySet().stream().toList();
  }
}
