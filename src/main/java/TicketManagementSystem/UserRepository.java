package TicketManagementSystem;

public interface UserRepository {
  public User getUser(String userId);
  public void setUser(User user);
}
