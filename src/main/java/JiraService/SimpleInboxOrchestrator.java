package JiraService;

import java.time.LocalDateTime;

public class SimpleInboxOrchestrator  implements  InboxOrchestrator{

TicketFactory ticketFactory;
Matcher matcher;
TicketManager ticketManager;
public SimpleInboxOrchestrator(TicketFactory ticketFactory, Matcher matcher, TicketManager ticketManager){
  this.ticketFactory = ticketFactory;
  this.matcher = matcher;
  this.ticketManager = ticketManager;
}


  @Override
  public void handleTicket(
      String message,
      int ticketId,
      int messageId,
      String from,
      String to,
      String subject,
      LocalDateTime dateTime,
      String body) {
    Ticket ticket = this.ticketFactory.createTicket(message, ticketId, messageId, from, to, subject, dateTime, body, this.ticketManager);
    Agent assignedAgent = this.matcher.match(ticket);
    return ;
  }

  @Override
  public void manuallyAssignTicket(Agent agent, Ticket ticketId) {
    ticketId.assign(agent);
  }
  public void changeTicketStatus(Ticket ticket, Status status){
  this.ticketManager.changeStatus(ticket, status);
  }

}
