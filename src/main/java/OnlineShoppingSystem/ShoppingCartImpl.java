package OnlineShoppingSystem;

import java.util.HashMap;
import java.util.List;

public class ShoppingCartImpl implements ShoppingCart{
  private HashMap<String, Integer> shoppingCart;
  public ShoppingCartImpl(){
    this.shoppingCart = new HashMap<>();
  }
  @Override
  public void addItem(String productId, int count) {
    this.shoppingCart.put(productId, count);
  }

  @Override
  public void removeItem(String productId, int count) {
    this.shoppingCart.put(productId, count);
  }

  @Override
  public List<String> getProductId() {
    return this.shoppingCart.keySet().stream().toList();
  }

  @Override
  public int getItemQuantity(String id) {
    return this.shoppingCart.get(id);
  }
}
