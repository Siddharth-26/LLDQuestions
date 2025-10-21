package OnlineShoppingSystem;

import java.util.List;

public interface ShoppingCart {
  public void addItem(String productId, int count);
  public void removeItem(String productId, int count);
  public List<String> getProductId();
  public int getItemQuantity(String id);
}
