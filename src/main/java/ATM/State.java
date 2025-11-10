package ATM;

public interface State {
  public int checkBalance(String cardNumber);
  public boolean withdrawMoney(String cardNumber, int amount);
  public boolean depositMoney(String cardNumber, int amount);
  public boolean authenticateUser(String cardNumber);
  public void cancelTransaction();
}
