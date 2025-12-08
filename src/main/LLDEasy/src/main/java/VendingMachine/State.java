package VendingMachine;

import java.math.BigInteger;

public interface State {
  public void payMoney(BigInteger money);
  public void selectItem( Item item);
  public void dispense(Item item);
  public void cancelSelection(Item item);
}
