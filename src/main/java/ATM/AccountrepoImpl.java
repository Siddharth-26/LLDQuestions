package ATM;

import java.util.concurrent.ConcurrentHashMap;

public class AccountrepoImpl implements AccountRepo{
  private ConcurrentHashMap<String, Account> cardAccountMap;
  public AccountrepoImpl(ConcurrentHashMap<String, Account> accountConcurrentHashMap){
    this.cardAccountMap = accountConcurrentHashMap;
  }
  @Override
  public Account getAccount(String cardNumber) {
    Account account = this.cardAccountMap.get(cardNumber);
    return account;
  }

  @Override
  public void setAccount(Account account) {
    this.cardAccountMap.put(account.getCardNumber(), account);
  }
}
