package JiraService;

import java.util.ArrayList;
import java.util.List;

public class AgentPool {
  List<Agent> agentList = new ArrayList<>();
  int index = 0;
  public void addAgents(Agent agent){
    this.agentList.add(agent);
  }
  public Agent getAgent(int index){
    return this.agentList.get(index);
  }
}
