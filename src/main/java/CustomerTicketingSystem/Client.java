package CustomerTicketingSystem;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public class Client {
  public static void main(String[] args) {
    ConcurrentHashMap<TicketType,List<Engineer>> engineerMap = new ConcurrentHashMap<>();
    Orchestrator orchestrator = new Orchestrator(new SimpleAssignmentStrategy(new EngineerRepoImpl(engineerMap)));
    Ticket ticket = new Ticket.Builder().ticketId(12).ticketDescription("Simple Ticket").type(TicketType.BILLING).customerId("1234").build();

  }
}
