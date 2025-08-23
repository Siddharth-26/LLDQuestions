package JiraService;

public class RoundRobinStrategy implements Matcher{

  AgentPool agentPool;

  public RoundRobinStrategy(AgentPool agentPool){
    this.agentPool = agentPool;
  }

  @Override
  public Agent match(Ticket ticket) {
    int index = this.agentPool.index;
    Agent agent = this.agentPool.getAgent(index);
    agent.addTicket(ticket);
    this.agentPool.index+=1;
    this.agentPool.index%=this.agentPool.agentList.size();
    return agent;
  }
}
