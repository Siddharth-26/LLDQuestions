package DigitalWallet;

public class StatementBuilder {
  public String createStatement(User user, int amount){
    if(amount<0){
      return "Sent amount to "+ user.getName();
    }
    else{
      return "received amount from"+ user.getName();
    }
  }
}
