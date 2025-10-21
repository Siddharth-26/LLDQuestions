package RobinHood;

import java.util.concurrent.ConcurrentHashMap;

public class UserRepo {
  private ConcurrentHashMap<String, User> userMap;
  public UserRepo(){
    this.userMap = new ConcurrentHashMap<>();
  }
  public void createUser( String userName,
      String userEmail,
      String password){
    User user =  new User(userName, userEmail, password);
    this.userMap.put(user.getUserId(), user);
  }
}
