package JiraService;

import java.util.HashMap;

public class Ticket implements Assignable{
  Priority priority;
  int SLA;
  HashMap<Integer, Comments> comments;
  Status status;
  int ticketId;
  String body;
  private final Object lock = new Object();

  public Ticket(Priority priority, int SLA, Status status, int ticketId){
    this.priority = priority;
    this.SLA = SLA;
    this.status = status;
    this.ticketId = ticketId;
  }
  public void addComment(Comments comment){
    this.comments.put(comment.messageId, comment);
  }
  public boolean containsMessage(int messageId){
    if(this.comments.containsKey(messageId)){
      return true;
    }
    return false;
  }

  @Override
  public void assign(Agent agent) {
    synchronized (lock){
    agent.addTicket(this);
    }
  }
}
