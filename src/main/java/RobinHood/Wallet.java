package RobinHood;

public interface Wallet {
  public void depositMoney(int amount);
  public void withdrawMoney(int amount);
  public void registerAccount(String account);
  public void blockAmount(int amount);
  public int getAvailableAmount();
}
