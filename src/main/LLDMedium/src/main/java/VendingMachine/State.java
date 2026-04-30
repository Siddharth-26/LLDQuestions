package VendingMachine;

public interface State {
  public String selectItem(int itemId, int count);
  public String makePayment(int amount);
  public String cancelTransaction();
  public String dispense();
}
