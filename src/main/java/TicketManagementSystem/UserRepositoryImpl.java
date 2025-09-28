package TicketManagementSystem;

import java.util.concurrent.ConcurrentHashMap;

public class UserRepositoryImpl implements UserRepository {
  ConcurrentHashMap<String, User> userRepository;
  public UserRepositoryImpl(ConcurrentHashMap<String, User> userRepository){
    this.userRepository = userRepository;
  }

  @Override
  public User getUser(String userId) {
    return this.userRepository.get(userId);
  }

  @Override
  public void setUser(User user) {
  this.userRepository.put(user.getUserId(), user);
  }

}
