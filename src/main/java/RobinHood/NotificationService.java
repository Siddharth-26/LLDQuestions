package RobinHood;

public interface NotificationService {
  public void informPartialOrder(Order order, Stock stock, int price, int amount);
  public void informCompleteOrder(Order order, Stock stock, int price, int amount);
  public void informFailedOrder(Order order, Stock stock, int price, int amount);
}
