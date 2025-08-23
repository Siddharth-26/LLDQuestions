package VendingMachine.Client;

import java.util.concurrent.ConcurrentHashMap;

import VendingMachine.States.VendingMachine;

public class Main {
  public static void main(String[] args){
    ConcurrentHashMap slots = new ConcurrentHashMap();
    slots.put(1, 5);
    slots.put(2, 5);
    slots.put(3, 5);
    slots.put(4, 5);
    slots.put(5, 5);
    VendingMachine machine = new VendingMachine(slots);
    machine.pressButton(2);
    machine.insertCoin(1);
    machine.pressButton(2);
    machine.insertCoin(1);
    machine.pressButton(2);
    machine.insertCoin(1);
    machine.pressButton(2);
    machine.insertCoin(1);
    machine.pressButton(2);
    machine.insertCoin(1);
    machine.pressButton(2);
    machine.insertCoin(1);
    machine.pressButton(2);
    machine.insertCoin(1);
    machine.pressButton(3);



  }
}
