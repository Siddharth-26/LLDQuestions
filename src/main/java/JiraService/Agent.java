package JiraService;

import java.util.ArrayList;
import java.util.List;

public class Agent {
  String name;
  int agentId;
  List<Ticket> assignedTickets = new ArrayList<>();

  public Agent(String name, int agentId){
    this.name = name;
    this.agentId = agentId;
  }
  public void addTicket(Ticket ticket){
    this.assignedTickets.add(ticket);
  }
  public void removeTicket(Ticket ticket){
    this.assignedTickets.remove(ticket);
  }
}
