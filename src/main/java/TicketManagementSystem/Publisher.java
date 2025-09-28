package TicketManagementSystem;

public interface Publisher {
  public void addSubscriber(Subscribe subscribe);
  public void removeSubscriber(Subscribe subscribe);
  public void notifySubscribers(String message);
}
