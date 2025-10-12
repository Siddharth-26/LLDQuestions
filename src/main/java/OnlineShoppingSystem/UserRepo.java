package OnlineShoppingSystem;

import java.util.List;

public interface UserRepo {
  public void changeUsername(String userId, String userName);
  public void adduser(User user);
  public void deleteUser(User user);
  public List<Order> getOrderList(String userId);
}
