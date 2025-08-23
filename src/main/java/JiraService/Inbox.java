package JiraService;

import java.time.LocalDateTime;

public class Inbox {

  InboxOrchestrator inboxOrchestrator;
  public Inbox(InboxOrchestrator inboxOrchestrator){
    this.inboxOrchestrator = inboxOrchestrator;
  }

  public void addMessage(String message, int ticketId, int messageId, String from, String to, String subject, LocalDateTime dateTime, String body){
    this.inboxOrchestrator.handleTicket(message, ticketId, messageId, from, to, subject, dateTime, body);
  }

}
