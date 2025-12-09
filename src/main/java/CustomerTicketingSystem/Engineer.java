package CustomerTicketingSystem;

import java.util.ArrayList;
import java.util.List;

public class Engineer {
  private List<TicketType> ticketTypes;
  private String id;
  private String engineerName;
  private List<Ticket> assignedTickets;
  public Engineer(List<TicketType> ticketTypes, String id, String engineerName){
    this.ticketTypes = ticketTypes;
    this.id = id;
    this.engineerName = engineerName;
    this.assignedTickets = new ArrayList<>();
  }
  public List<TicketType> getEngineerType(){
    return this.ticketTypes;
  }
  public void addEngineerType(TicketType type){
    this.ticketTypes.add(type);
  }
  public void assignTicket(Ticket ticket){
    this.assignedTickets.add(ticket);
  }

  public int getAssignedTickets(){
    return this.assignedTickets.size();
  }

}
