package RobinHood;

import java.util.List;

public interface TransactionHistory {
  public void addTransaction(Transaction transaction);
  public List<Transaction> getTransactionHistory();
}
