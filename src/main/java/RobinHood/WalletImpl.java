package RobinHood;

public class WalletImpl implements Wallet{
  private String userId;
  private int amount;
  private String bankAccount;
  private int blockedAmount = 0;

  public WalletImpl(String userId, int amount) {
    this.userId = userId;
    this.amount = amount;
  }

  @Override
  public void depositMoney(int amount) {
    this.amount+=amount;
  }

  @Override
  public void withdrawMoney(int amount) {
    this.amount-=amount;
  }

  @Override
  public void registerAccount(String account) {
    this.bankAccount = account;
  }

  @Override
  public void blockAmount(int amount) {
    this.blockedAmount = amount;
    this.amount-=amount;
  }

  @Override
  public int getAvailableAmount() {
    return this.amount;
  }
}
