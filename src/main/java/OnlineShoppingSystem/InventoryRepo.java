package OnlineShoppingSystem;

import java.util.List;

public interface InventoryRepo {
  public boolean addProduct(String id, int count) throws Exception;
  public boolean removeProduct(String id, int count) throws Exception;
}
