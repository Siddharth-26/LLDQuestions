package OnlineAuctionSystem;

public interface UserRepo {
  public void addUser(User user);
  public User getUser(User user);
  public User getUserbyId(String userId);
  public void deleteUser(User user);
}
