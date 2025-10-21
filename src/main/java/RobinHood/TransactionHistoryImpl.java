package RobinHood;

import java.util.ArrayList;
import java.util.List;

public class TransactionHistoryImpl implements TransactionHistory{
  private List<Transaction> transactionHistory;
  private String userId;
  public TransactionHistoryImpl(String userId){
    this.transactionHistory = new ArrayList<>();
    this.userId = userId;
  }
  @Override
  public synchronized void addTransaction(Transaction transaction) {
    this.transactionHistory.add(transaction);
  }

  @Override
  public List<Transaction> getTransactionHistory() {
    return this.transactionHistory;
  }
}
