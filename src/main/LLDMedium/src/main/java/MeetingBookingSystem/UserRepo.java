package MeetingBookingSystem;

import java.util.HashMap;

public class UserRepo {
  private HashMap<String, User> userMap;

  public UserRepo(HashMap<String,User> userMao) {
    this.userMap = userMao;
  }

  public HashMap<String,User> getUserMao() {
    return userMap;
  }

  public void setUserMao(HashMap<String,User> userMao) {
    this.userMap = userMao;
  }
  public void addUser(User user){
    this.userMap.put(user.getUserId(), user);
  }
  public User getUser(String userId){
    return this.userMap.get(userId);
  }
}
