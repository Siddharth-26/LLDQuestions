package OnlineShoppingSystem;

import java.util.Arrays;
import java.util.List;

public class SearchStrategyImplById implements SearchStrategy<String>{
  private ProductInventory productInventory;
  public SearchStrategyImplById(ProductInventory productInventory){
    this.productInventory = productInventory;
  }
  @Override
  public List<Product> search(String criteria) {
    Product[] arr = {this.productInventory.getProduct(criteria)};
    return Arrays.asList(arr);
  }
}
