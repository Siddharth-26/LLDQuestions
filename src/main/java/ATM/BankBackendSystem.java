package ATM;

public interface BankBackendSystem {
  public boolean validate(String cardNumber);
  public int getBalance(String cardNumber);
  public boolean executeWithdrwal(String cardNumber, int amount);
  public boolean executeDeposit(String cardNumber, int amount);
}
