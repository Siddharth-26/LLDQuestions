package ATM;

import java.util.UUID;

public class AccountImpl implements Account{
  private String accountHolderName;
  private int balance;
  private String pin;
  private String cardNumber;

  public AccountImpl(String accountHolderName, String cardNumber){
    this.accountHolderName = accountHolderName;
    this.balance = 0;
    this.pin = UUID.randomUUID().toString();
    this.cardNumber = cardNumber;
  }


  @Override
  public String getAccountDetails() {
    return "";
  }

  @Override
  public String getPin() {
    return "";
  }

  @Override
  public void setPin(String pin) {

  }

  @Override
  public String getAccountHolderName() {
    return "";
  }

  @Override
  public String setAccountHolderName(String name) {
    return "";
  }

  @Override
  public int getBalance() {
    return 0;
  }

  @Override
  public int depositMoney() {
    return 0;
  }

  @Override
  public int withdrawMoney() {
    return 0;
  }

  @Override
  public boolean checkPin(String pin) {
    if(this.pin==pin){
      return true;
    }
    return false;
  }

  @Override
  public String getCardNumber() {
    return this.cardNumber;
  }

  @Override
  public void setCardNumber(String cardNumber) {
    this.cardNumber =  cardNumber;
  }
}
