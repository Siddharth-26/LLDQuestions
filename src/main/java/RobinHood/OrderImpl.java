package RobinHood;

import java.time.Instant;

public class OrderImpl implements Order{
  private User user;
  private Stock stock;
  private Instant placedAt;
  private int amount;

  public OrderImpl(User user, Stock stock, int amount) {
    this.user = user;
    this.stock = stock;
    this.placedAt = Instant.now();
    this.amount = amount;
  }

  @Override
  public User getSubscriber() {
    return this.user;
  }

  @Override
  public Stock getStock() {
    return this.stock;
  }

  @Override
  public int getAmount() {
    return this.amount;
  }

  @Override
  public int getTotalPrice() {
    return this.stock.getPrice()*this.amount;
  }
}
