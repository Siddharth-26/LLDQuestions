package OnlineShoppingSystem;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public class InventoryRepoImpl implements InventoryRepo{
  private ConcurrentHashMap<String, Integer> productInventory;
  public InventoryRepoImpl(ConcurrentHashMap<String, Integer> productInventory){
    this.productInventory = productInventory;
  }
  @Override
  public boolean addProduct(String id, int count) throws Exception {
   this.productInventory.compute(id, (key, value)->{
     return value+count;
   });
   return true;
  }

  @Override
  public boolean removeProduct(String id, int count) {
    this.productInventory.compute(id, (key, value)->{
      if(value>=count){
        return value-count;
      }
      else{
        throw new IllegalArgumentException("Out of stock");
      }
    });
    return false;
  }

}
