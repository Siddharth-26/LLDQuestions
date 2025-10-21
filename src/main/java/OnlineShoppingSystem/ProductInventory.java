package OnlineShoppingSystem;

import java.util.List;

public interface ProductInventory {
  public List<Product> getAllProduct();
  public void addProduct(Product product);
  public void removeProduct(Product product);
  public Product getProduct(String id);
}
