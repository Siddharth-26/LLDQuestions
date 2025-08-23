package JiraService;

public class TicketManager {
  TicketPool OpenTicketPool;
  TicketPool ClosedTicketPool;
  public TicketManager(TicketPool OpenTicketPool, TicketPool ClosedTicketPool){
    this.OpenTicketPool = OpenTicketPool;
    this.ClosedTicketPool = ClosedTicketPool;
  }

  public Ticket checkPastTicket(int ticketId, int messageId, String from , String message){
  Ticket pastTicket = this.checkTicketPresent(ticketId);
    if(pastTicket!=null){
    if(pastTicket.containsMessage(messageId)){
      return pastTicket;
    }
    else{
      pastTicket.addComment(new Comments(from, messageId, message));
      pastTicket.status = Status.OPEN;
      return pastTicket;
    }
  }
    return pastTicket;
  }
  private Ticket checkTicketPresent(int ticketId){
    if(this.OpenTicketPool.getTicket(ticketId)!=null){
      return this.OpenTicketPool.getTicket(ticketId);
    }
    if(this.ClosedTicketPool.getTicket(ticketId)!=null){
      return this.ClosedTicketPool.getTicket(ticketId);
    }
    return null;
  }
  public void changeStatus(Ticket ticket, Status status){
    if(status==Status.CLOSED){
      Ticket openTicket = this.OpenTicketPool.getTicket(ticket.ticketId);
      openTicket.status = Status.CLOSED;
      this.ClosedTicketPool.addTicket(openTicket);
    }
    else{
      ticket.status = status;
    }
  }
}
