package MusicStreamingPlatform;

import java.util.HashMap;

public class UserRepo {
  private HashMap<String, User> userMap;
  public UserRepo(){
    this.userMap = new HashMap<>();
  }
  public User getUser(String userId){
    return this.userMap.get(userId);
  }
  public void addUser(User user){
    this.userMap.put(user.getUserId(), user);
  }
}
