package OnlineShoppingSystem;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public class ProductInventoryImpl implements ProductInventory{
  private ConcurrentHashMap<String , Product> productMap;
  public ProductInventoryImpl(){
    this.productMap = new ConcurrentHashMap<>();
  }
  @Override
  public List<Product> getAllProduct() {
    return this.productMap.values().stream().toList();
  }

  @Override
  public void addProduct(Product product) {
this.productMap.put(product.getProductId(), product);
  }

  @Override
  public void removeProduct(Product product) {
  this.productMap.remove(product.getProductId());
  }

  @Override
  public Product getProduct(String id) {
    return this.productMap.get(id);
  }
}
