package OnlineShoppingSystem;

import java.util.ArrayList;
import java.util.List;

public class SearchStrategyImplByCategory implements SearchStrategy<ProductCategory>{
  private ProductInventory productInventory;
  public SearchStrategyImplByCategory(ProductInventory productInventory){
    this.productInventory = productInventory;
  }
  @Override
  public List<Product> search(ProductCategory criteria) {
  List<Product> productList = this.productInventory.getAllProduct();
  List<Product> ansList = new ArrayList<>();
  for(Product x: productList){
    if(x.getCategory()==criteria){
      ansList.add(x);
    }
  }
  return ansList;
  }
}
