package OnlineShoppingSystem;

import java.util.List;
import java.util.UUID;

public class Order {
  private String orderId;
  private String userId;
  private List<String> productList;

  public Order(String userId, List<String> productList) {
    this.orderId = UUID.randomUUID().toString();
    this.userId = userId;
    this.productList = productList;
  }

  public String getOrderId() {
    return orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }

  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public List<String> getProductList() {
    return productList;
  }

  public void setProductList(List<String> productList) {
    this.productList = productList;
  }
  public void addProduct(String productId){
    this.productList.add(productId);
  }
}
