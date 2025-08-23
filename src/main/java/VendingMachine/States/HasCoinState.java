package VendingMachine.States;


public class HasCoinState implements State {
  VendingMachine machine;
  public HasCoinState(VendingMachine machine){
    this.machine = machine;
  }
  @Override
  public void insertCoin(int coin) {
    System.out.println("Already has inserted a coin so please make a slot selection.");
  }

  @Override
  public synchronized void pressButton(int slotNumber) {
  if(this.machine.slots.get(slotNumber)>0){
    System.out.println("Dispensing this item" +  slotNumber);
    this.machine.slots.put(slotNumber, this.machine.slots.get(slotNumber)-1);
    this.machine.changeState(new DispensingState(this.machine));
    this.dispense();
  }
  else{
    System.out.println("This slot is empty please select a different slot from the list of slots refunding the current amount");
    this.machine.refund();
    boolean flag = false;
    for (Integer x: this.machine.slots.keySet()){
      int count = this.machine.slots.get(x);
      if(count>0){
        flag = true;
      }
    }
    if(flag) {
      this.machine.changeState(new IdleState(this.machine));
    }
    else{
      System.out.println("We are completely sold out");
      this.machine.refund();
      this.machine.changeState(new SoldOutState());
    }
  }
  }

  @Override
  public void dispense() {
  this.machine.dispense();
  }
}
