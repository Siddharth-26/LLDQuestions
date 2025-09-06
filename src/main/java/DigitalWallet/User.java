package DigitalWallet;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class User {
  private String name;
  private String email;
  private String mobileNumber;
  private String deviceId;
  private String userId;
  private List<Account> accountList = new ArrayList<>();
  private List<PaymentMethod> paymentMethodsList = new ArrayList<>();
  private StatementBuilder statementBuilder;
  private List<String> transactionHistory = new ArrayList<>();
  public String getName() {
    return name;
  }

  private User(Builder b){
    this.name = b.name;
    this.email = b.email;
    this.mobileNumber = b.mobileNumber;
    this.deviceId = b.deviceId;
    this.userId = b.userId;
  }

  public class Builder{
    private String name;
    private String email;
    private String mobileNumber;
    private String deviceId;
    private String userId;
    private List<Account> accountList;
    private List<PaymentMethods> paymentMethodsList;
    private List<String> transactionHistory;
    public Builder name(String name){
      this.name = name;
      return this;
      }
    public Builder email(String email){
      this.email = email;
      return this;
    }
    public Builder mobileNumber(String mobileNumber){
      this.mobileNumber = mobileNumber;
      return this;
    }
    public Builder userId(){
      this.userId = UUID.randomUUID().toString();
      return this;
    }
    public User build(){
      return new User(this);
    }
  }
  public void addAccount(String accountNumber){
    Account account = new Account(accountNumber, this.userId);
    this.accountList.add(account);
  }
  public void removeAccount(Account account){
    this.accountList.remove(account);
  }
  public void addPaymentMethod(String creditCardNumber){
    this.paymentMethodsList.add(new CreditCardPaymentMethod(creditCardNumber));
  }
  public void addPaymentMethod(PaymentMethod paymentMethod){
    this.paymentMethodsList.remove(paymentMethod);
  }
  public void addTransaction(User user, int amount){
    this.transactionHistory.add(this.statementBuilder.createStatement(user, amount));
  }

  public String getUserId() {
    return userId;
  }
  public String getPrimaryAccount(){
    return this.accountList.get(0).getAccountNumber();
  }
}
