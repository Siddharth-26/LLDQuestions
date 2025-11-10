package ATM;

public class ATMOrchestrator {
  private String cardNumber;
  private State currentState;
  private ATMHardware atmHardware;

  public ATMOrchestrator(ATMHardware atmHardware){
    this.atmHardware = atmHardware;
  }

  public void authenticateUser(String cardNumber){

  }
  public void withdrawMoney(int amount){

  }
  public void depositMoney(int amount){

  }
  public void checkBalance(){

  }
  public void changeState(State state){

  }

  public ATMHardware getAtmHardware() {
    return atmHardware;
  }
  public void setCardNumber(String cardNumber){
    this.cardNumber = cardNumber;
  }
  public void cancelTransaction(){
    this.cardNumber = null;
  }
}
