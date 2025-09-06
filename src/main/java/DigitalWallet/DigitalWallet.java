package DigitalWallet;


public class DigitalWallet {
  TransactionManagerPeertoPeer transactionManagerPeertoPeer;
  Configuration  configuration;
  public DigitalWallet(TransactionManagerPeertoPeer transactionManagerPeertoPeer, Configuration configuration){
    this.transactionManagerPeertoPeer = transactionManagerPeertoPeer;
    this.configuration  = configuration;
  }
  public boolean transfer(User user1, User user2, int amount, String currency){
    int convertedAmount = this.configuration.convert(currency, "INR", amount).intValue();
    return this.transactionManagerPeertoPeer.transferMoney(user1, user2, convertedAmount);
  }
}
