package ATM;

public interface AccountRepo {
  public Account getAccount(String cardNumber);
  public void setAccount(Account account);
}
