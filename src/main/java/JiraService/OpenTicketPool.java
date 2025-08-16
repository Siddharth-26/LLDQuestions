package JiraService;

import java.util.HashMap;

public class OpenTicketPool  implements TicketPool{
  HashMap<Integer, Ticket> openTicketPool = new HashMap<>();

  @Override
  public void addTicket(Ticket ticket) {
    this.openTicketPool.put(ticket.ticketId, ticket);
  }

  @Override
  public Ticket getTicket(int ticketId) {
    return this.openTicketPool.get(ticketId);
  }
}
