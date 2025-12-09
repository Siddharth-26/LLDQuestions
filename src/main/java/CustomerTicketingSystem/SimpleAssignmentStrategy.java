package CustomerTicketingSystem;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class SimpleAssignmentStrategy implements AssignmentStrategy{
  private EngineerRepo engineerRepo;
  public SimpleAssignmentStrategy(EngineerRepo engineerRepo){
    this.engineerRepo = engineerRepo;
  }
  @Override
  public Engineer assignTicket(Ticket ticket) {
    List<Engineer> engineers = this.engineerRepo.getEngineerTicketType(ticket.getType());
    PriorityQueue<Engineer> priorityQueue = new PriorityQueue<>(Comparator.comparingInt(t->t.getAssignedTickets()));
    for(Engineer engineer: engineers){
      priorityQueue.add(engineer);
    }
    return priorityQueue.poll();
  }
}
