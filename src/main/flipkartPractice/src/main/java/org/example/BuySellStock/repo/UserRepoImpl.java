package org.example.BuySellStock.repo;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;

import org.example.BuySellStock.models.User;

public class UserRepoImpl implements IUserRepo {
  private ConcurrentHashMap<String, User> userMapping = new ConcurrentHashMap<>();

  @Override
  public boolean addUser(User user) {
    User stored = this.userMapping.computeIfAbsent(user.getUserId(), (key)->{
      return user;
    });
    if(stored!=null) {
      return true;
    }
    return false;
  }

  @Override
  public boolean removeUser(User user) {
    AtomicReference<Boolean> result = new AtomicReference<>(false);
    this.userMapping.computeIfPresent(user.getUserName(), (key, value)->{
      if(value!=null){
        result.set(false);
      }
      else{
        result.set(true);
      }
      return null;
    });
    return result.get();
  }
}
