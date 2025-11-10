package ATM;

public class UnAuthenticatedState implements State{
  private ATMOrchestrator context;
  private BankBackendSystem bankBackendSystem;
  public UnAuthenticatedState(ATMOrchestrator context, BankBackendSystem bankBackendSystem){this.context = context;
  this.bankBackendSystem = bankBackendSystem;}

  @Override
  public int checkBalance(String cardNumber) {
    String message = "You need to verify yourself before checking the balance, please insert your card and enter pin";
    ATMHardware atmHardware = this.context.getAtmHardware();
    atmHardware.displayMessage(message);
    return 0;
  }

  @Override
  public boolean withdrawMoney(String cardNumber, int amount) {
    String message = "You need to verify yourself before withdrawing money, please insert your card and enter pin";
    ATMHardware atmHardware = this.context.getAtmHardware();
    atmHardware.displayMessage(message);
    return false;
  }

  @Override
  public boolean depositMoney(String cardNumber, int amount) {
    String message = "You need to verify yourself before withdrawing money, please insert your card and enter pin";
    ATMHardware atmHardware = this.context.getAtmHardware();
    atmHardware.displayMessage(message);
    return false;
  }

  @Override
  public boolean authenticateUser(String cardNumber) {
    boolean isAuthenticated = bankBackendSystem.validate(cardNumber);
    if(isAuthenticated){
      this.context.setCardNumber(cardNumber);
      return isAuthenticated;
    }
    return false;
  }

  @Override
  public void cancelTransaction() {
    return;
  }
}
