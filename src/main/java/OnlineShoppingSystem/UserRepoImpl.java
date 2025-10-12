package OnlineShoppingSystem;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public class UserRepoImpl implements UserRepo{
  private ConcurrentHashMap<String, User> userMap;
  public UserRepoImpl(){
    this.userMap = new ConcurrentHashMap<>();
  }
  @Override
  public void changeUsername(String userId, String userName) {
    User user = this.userMap.get(userId);
    user.setUserName(userName);
  }

  @Override
  public void adduser(User user) {
  this.userMap.put(user.getUserId(), user);
  }

  @Override
  public void deleteUser(User user) {
  this.userMap.remove(user.getUserId());
  }

  @Override
  public List<Order> getOrderList(String userId) {
    User user = this.userMap.get(userId);
    return user.getOrderList();
  }
}
