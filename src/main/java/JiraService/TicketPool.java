package JiraService;

public interface TicketPool {
  public void addTicket(Ticket ticket);
  public Ticket getTicket(int ticketId);
}
