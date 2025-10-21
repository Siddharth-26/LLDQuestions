package RobinHood;

public interface Order {
  public User getSubscriber();
  public Stock getStock();
  public int getAmount();
  public int getTotalPrice();
}
