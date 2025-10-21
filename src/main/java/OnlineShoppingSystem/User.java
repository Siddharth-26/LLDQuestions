package OnlineShoppingSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class User {
  private String userName;
  private String phoneNumber;
  private List<Order> orderList;
  private String userId;
  private ShoppingCart shoppingCart;

  public User(String userName, String phoneNumber) {
    this.userName = userName;
    this.phoneNumber = phoneNumber;
    this.orderList = new ArrayList<>();
    this.userId = UUID.randomUUID().toString();
    this.shoppingCart = new ShoppingCartImpl();
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public List<Order> getOrderList() {
    return orderList;
  }

  public void setOrderList(List<Order> orderList) {
    this.orderList = orderList;
  }

  public ShoppingCart getShoppingCart() {
    return shoppingCart;
  }

  public void setShoppingCart(ShoppingCart shoppingCart) {
    this.shoppingCart = shoppingCart;
  }
  public void addItemstoCart(String productId, int count){
    this.shoppingCart.addItem(productId, count);
  }
  public void removeItemfromCart(String productId, int count){
    this.shoppingCart.removeItem(productId,count);
  }
  public void addOrder(Order order){
    this.orderList.add(order);
  }
}
