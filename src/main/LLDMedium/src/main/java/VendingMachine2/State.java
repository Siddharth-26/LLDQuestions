package VendingMachine2;


public interface State {
  public State selectItem(String itemId, int count);
  public State addMoney(int amount);
  public State dispenseMoney();
  public State dispenseItem();
  public State cancelTransaction();
}

