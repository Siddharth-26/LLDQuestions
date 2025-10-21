package RobinHood;

import java.time.Instant;
import java.util.UUID;

public class User implements Subscriber{
  private String userName;
  private String userEmail;
  private String password;
  private String userId;
  private TransactionHistory transactionHistory;
  private Wallet wallet;
  private PortFolio portfolio;

  public User(
      String userName,
      String userEmail,
      String password) {
    this.userName = userName;
    this.userId = UUID.randomUUID().toString();
    this.userEmail = userEmail;
    this.password = password;
    this.transactionHistory = new TransactionHistoryImpl(this.userId);
    this.wallet = new WalletImpl(this.userId, 0);
    this.portfolio = new PortFolioImpl(this.userId);
  }
  private void addTransaction(Stock stock, int price, int amount){
    Transaction transaction = new TransactionImpl(this.userId, stock, amount, price, Instant.now());
    this.transactionHistory.addTransaction(transaction);
  }
  @Override
  public void informPartialOrder(Stock stock, int price, int amount) {
    System.out.println(stock + Integer.toString(price) + Integer.toString(amount));
    this.addTransaction(stock, price, amount);
  }

  @Override
  public void informCompleteOrder(Stock stock, int price, int amount) {
    System.out.println(stock + Integer.toString(price) + Integer.toString(amount));
    this.addTransaction(stock, price, amount);
  }

  @Override
  public void informOrderFailure(Order order) {
    System.out.println("Order failed" + order.toString());
  }
  public boolean checkFunds(int amount){
    if(this.wallet.getAvailableAmount()>=amount){
      this.wallet.blockAmount(amount);
      return true;
    }
    else{
      return false;
    }
  }
  public boolean checkStocks(int amount, Stock stock){
    if(this.portfolio.getStockCount(stock)>=amount){
      this.portfolio.removeFromPortfolio(stock, amount);
      this.portfolio.blockStocks(stock, amount);
      return true;
    }
    else{
      return false;
    }
  }
  public String getUserId(){
    return this.userId;
  }
}
