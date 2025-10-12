package OnlineAuctionSystem;

import java.util.concurrent.ConcurrentHashMap;

public class UserRepoImpl implements UserRepo{
  ConcurrentHashMap<String, User> userMap;
  public UserRepoImpl(){
    this.userMap = new ConcurrentHashMap<>();
  }
  @Override
  public void addUser(User user) {
    this.userMap.put(user.getUserId(), user);
  }

  @Override
  public User getUser(User user) {
    if(this.userMap.containsKey(user.getUserId())){
      return this.userMap.get(user.getUserId());
    }
    return null;
  }

  @Override
  public User getUserbyId(String userId) {
    return this.userMap.get(userId);
  }

  @Override
  public void deleteUser(User user) {
    if(this.userMap.containsKey(user.getUserId())){
      this.userMap.remove(user.getUserId());
    }
  }
}
