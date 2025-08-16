package JiraService;

import java.time.LocalDateTime;

public interface InboxOrchestrator {
  public void handleTicket(
      String message,
      int ticketId,
      int messageId,
      String from,
      String to,
      String subject,
      LocalDateTime dateTime,
      String body);

  public void manuallyAssignTicket(Agent agent, Ticket ticketId);

}
