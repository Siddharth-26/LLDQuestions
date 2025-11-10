package ATM;

public class AuthenticatedState implements State{
  private ATMOrchestrator context;
  private BankBackendSystem bankBackendSystem;
  public AuthenticatedState(ATMOrchestrator context, BankBackendSystem bankBackendSystem){this.context = context;
  this.bankBackendSystem = bankBackendSystem;}
  @Override
  public int checkBalance(String cardNumber) {
    int amount = bankBackendSystem.getBalance(cardNumber);
    return amount;
  }

  @Override
  public boolean withdrawMoney(String cardnUmber, int amount) {
    boolean isWithdrawn = bankBackendSystem.executeWithdrwal(cardnUmber, amount);
    if(isWithdrawn){
      ATMHardware atmHardware = this.context.getAtmHardware();
      String message = "You have withdrawn amount" + amount + "Please collect from the dispenser.";
      atmHardware.displayMessage(message);
      atmHardware.dispenseCash(amount);
      return true;
    }
    else{
      ATMHardware atmHardware = this.context.getAtmHardware();
      String message = "Sorry there is a problem withdrawing from your account Maybe the balance is not enough check the balance and try again.";
      atmHardware.displayMessage(message);
      return false;
    }
  }

  @Override
  public boolean depositMoney(String cardNumber, int amount) {
    boolean isDeposited = this.bankBackendSystem.executeDeposit(cardNumber, amount);
    if(isDeposited){
      ATMHardware atmHardware = this.context.getAtmHardware();
      String message = "You have deposited amount" + amount + "Have a nice day.";
      atmHardware.displayMessage(message);
      atmHardware.dispenseCash(amount);
      return true;
    }
    else{
      ATMHardware atmHardware = this.context.getAtmHardware();
      String message = "Sorry there is a problem depositing from your account Maybe the balance is not enough check the balance and try again.";
      atmHardware.displayMessage(message);
      return false;
    }
  }

  @Override
  public boolean authenticateUser(String cardNumber) {
    String message = "You are already authenticated please select the items from the menu do you want to withdraw/deposit or check the balance";
    ATMHardware atmHardware = this.context.getAtmHardware();
    atmHardware.displayMessage(message);
    return true;
  }

  @Override
  public void cancelTransaction() {
    this.context.cancelTransaction();
    State unauthState = new UnAuthenticatedState(this.context, bankBackendSystem);
    this.context.changeState(unauthState);
  }
}
