package RobinHood;

public class NotificationServiceImpl implements NotificationService{

  @Override
  public void informPartialOrder(Order order, Stock stock, int price, int amount) {
    Subscriber user = order.getSubscriber();
    user.informPartialOrder(stock, price, amount);
  }

  @Override
  public void informCompleteOrder(Order order, Stock stock, int price, int amount) {
    Subscriber user = order.getSubscriber();
    user.informCompleteOrder(stock, price, amount);
  }

  @Override
  public void informFailedOrder(Order order, Stock stock, int price, int amount) {
    Subscriber user = order.getSubscriber();
    user.informOrderFailure(order);
  }
}
