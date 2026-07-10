package org.example.BNPL;

import java.util.HashMap;

public class UserRepo {
  HashMap<String, Users>  usersMap;
  public UserRepo(HashMap<String, Users> users) {
    this.usersMap = new  HashMap<>();
  }
  public boolean addUser(Users user){
    if(this.usersMap.containsKey(user.userId)){
      return false;
    }
    this.usersMap.put(user.userId, user);
    return true;
  }
  public boolean hasUser(String userId){
    return this.usersMap.containsKey(userId);
  }
  public Users getUser(String userId){
    return this.usersMap.get(userId);
  }
}
