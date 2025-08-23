package VendingMachine.States;

import java.util.concurrent.ConcurrentHashMap;

public class VendingMachine {
  State state;
  ConcurrentHashMap<Integer, Integer> slots;
  public VendingMachine(ConcurrentHashMap<Integer, Integer> slots){
    this.state = new IdleState(this);
    this.slots = slots;
  }
  public void insertCoin(int coin){
    this.state.insertCoin(coin);
  }
  public void pressButton(int slotNumber){
    this.state.pressButton(slotNumber);
    this.dispense();
  }
  void dispense(){
    this.state.dispense();
  }
  public void changeState(State newState){
    this.state = newState;
  }
  // This is to be used once the machine is sold out and then we need to refill and then reset the machine to the idle state again.
  public void reset(){
    this.state = new IdleState(this);
  }
  public void refund(){
    System.out.println("Refund complete");
  }
}
