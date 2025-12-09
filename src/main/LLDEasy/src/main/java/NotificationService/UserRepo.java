package NotificationService;

import java.util.HashMap;

public class UserRepo {
  private HashMap<String, User> userMap;
  public UserRepo(HashMap<String, User> userMap){
    this.userMap = userMap;
  }
  public User getUser(String userId){
    return this.userMap.get(userId);
  }
}
