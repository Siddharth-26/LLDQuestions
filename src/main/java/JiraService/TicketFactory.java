package JiraService;

import java.time.LocalDateTime;
// This class is named factory but manages more than a factory it creates the object as
public class TicketFactory {

  public Ticket createTicket(String message,
      int ticketId,
      int messageId,
      String from,
      String to,
      String subject,
      LocalDateTime dateTime,
      String body, TicketManager ticketManager){
    // Pre process this so make sure that you first check the ticket in the open ticket pool and closed ticket pool and check also that the message is found in the ticket
    // If the ticket is found but the message is not there add it other wise just check if there
    Ticket pastTicket = ticketManager.checkPastTicket(ticketId, messageId, from, message);
    if(pastTicket!=null){
      return pastTicket;
    }
    Priority priority = Priority.LOW;
    int sla = Configuration.getInstance().prioritySLAHashMap.get(priority);
    Ticket ticket = new Ticket(priority, sla, Status.OPEN, ticketId);
    Comments comment = new Comments(from, messageId, body);
    ticket.addComment(comment);
    return ticket;
  }
}
