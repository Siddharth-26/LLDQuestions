package DigitalWallet;

public interface Transaction {
  public boolean transferMoney(User user1, User user2, int amount);
}
