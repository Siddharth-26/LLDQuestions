package CustomerTicketingSystem;

public class Ticket {
  private int ticketId;
  private String customerId;
  private String ticketDescription;
  private TicketType type;
  private TicketPriority priority;

  public Ticket(Builder b){
    this.ticketId = b.ticketId;
    this.ticketDescription = b.ticketDescription;
    this.customerId = b.customerId;
    this.type = b.type;
    this.priority = b.priority;
  }

  public static class Builder{
  private int ticketId;
  private String customerId;
  private String ticketDescription;
  private TicketType type;
  private TicketPriority priority;
  public Builder ticketId(int ticketId){
    this.ticketId = ticketId;
    return this;
  }
  public Builder customerId(String customerId){
    this.customerId = customerId;
    return this;
  }
  public Builder ticketDescription(String ticketDescription){
    this.ticketDescription = ticketDescription;
    return this;
  }
  public Builder type(TicketType type){
    this.type = type;
    return this;
  }
  public Builder priority(TicketPriority priority){
    this.priority = priority;
    return this;
  }
  public Ticket build(){
    return new Ticket(this);
  }
  }

  public int getTicketId() {
    return ticketId;
  }

  public String getCustomerId() {
    return customerId;
  }

  public String getTicketDescription() {
    return ticketDescription;
  }

  public TicketType getType() {
    return type;
  }

  public TicketPriority getPriority() {
    return priority;
  }
}
