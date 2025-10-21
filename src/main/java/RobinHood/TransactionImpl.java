package RobinHood;

import java.time.Instant;

public class TransactionImpl implements Transaction{
  private String userId;
  private Instant timeStamp;
  private Stock stock;
  private int amount;
  private int price;

  public TransactionImpl(String userId, Stock stock, int amount, int price, Instant timeStamp) {
    this.userId = userId;
    this.timeStamp = timeStamp;
  }

  @Override
  public void getTransactionDetails() {
    this.toString();
    return;
  }

  @Override
  public String toString() {
    return "TransactionImpl{" + "userId='" + userId + '\'' + ", timeStamp=" + timeStamp + ", stock=" + stock +
        ", amount=" + amount + '}';
  }
}
