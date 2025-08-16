package JiraService;

import java.util.HashMap;

public class ClosedTicketPool implements TicketPool{
  HashMap<Integer, Ticket> closedTicketPool = new HashMap<>();
  @Override
  public void addTicket(Ticket ticket) {
    this.closedTicketPool.put(ticket.ticketId, ticket);
  }

  @Override
  public Ticket getTicket(int ticketId) {
    if(this.closedTicketPool.containsKey(ticketId)){
    return this.closedTicketPool.get(ticketId);

    }
    return null;
  }
}
