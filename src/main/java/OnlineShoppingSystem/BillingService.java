package OnlineShoppingSystem;

import java.math.BigDecimal;

public class BillingService {
  private ProductInventory productInventory;
  public BillingService(ProductInventory productInventory){
    this.productInventory = productInventory;
  }
  public BigDecimal calculateBill(ShoppingCart shoppingCart){
    BigDecimal amount = new BigDecimal(0);
    for(String id: shoppingCart.getProductId()){
      Product product = this.productInventory.getProduct(id);
      int price = product.getPrice();
      amount.add(BigDecimal.valueOf(price*shoppingCart.getItemQuantity(id)));
    }
    return amount;
  }
}
