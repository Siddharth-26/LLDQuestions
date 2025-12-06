package CustomerTicketingSystem;

public class Orchestrator {

  private AssignmentStrategy assignmentStrategy;
  public Orchestrator(AssignmentStrategy assignmentStrategy){
    this.assignmentStrategy = assignmentStrategy;
  }

  public Engineer submitTicket(Ticket ticket){
    return this.assignmentStrategy.assignTicket(ticket);
  }
}
