package DigitalWallet;

public class Account {
  private String userId;
  private String AccountNumber;
  private int amount;
  public Account(String userId ,String accountNumber){
    this.userId = userId;
    this.AccountNumber = accountNumber;
    this.amount = 0;
  }

  public String getUserId() {
    return userId;
  }

  public String getAccountNumber() {
    return AccountNumber;
  }

  public int getAmount() {
    return amount;
  }

  public void setAmount(int amount) {
    this.amount = amount;
  }
}
