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
  public boolean removeUser(String userId) {
    AtomicReference<Boolean> result = new AtomicReference<>(false);
    this.userMapping.computeIfPresent(userId, (key, value)->{
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
  public boolean addUserBalance(String userId, int ballance) {
    User user = this.userMapping.computeIfPresent(userId, (key, value)->{
      value.addWalletBalance(ballance);
      return value;
    });
    if(user!=null) {
      return true;
    }
    return false;
  }

  @Override
  public User getUser(String userId) {
    return this.userMapping.computeIfPresent(userId, (key, value)->
    {
      return value;
    });
  }

  @Override
  public boolean updateUser(User user) {
    this.userMapping.compute(user.getUserId(), (key, value)->{
      return user;
    });
    return true;
  }
}
