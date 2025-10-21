package OnlineAuctionSystem;

public interface Publisher {
  public void sendNotifications(String message);
  public void addSubscriber(Subscriber subscriber);
  public void removeSubscriber(Subscriber subscriber);
}
