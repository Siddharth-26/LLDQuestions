package ATM;

public interface Account {
  public String getAccountDetails();
  public String getPin();
  public void setPin(String pin);
  public String getAccountHolderName();
  public String setAccountHolderName(String name);
  public int getBalance();
  public int depositMoney();
  public int withdrawMoney();
  public boolean checkPin(String pin);
  public String getCardNumber();
  public void setCardNumber(String cardNumber);
}
