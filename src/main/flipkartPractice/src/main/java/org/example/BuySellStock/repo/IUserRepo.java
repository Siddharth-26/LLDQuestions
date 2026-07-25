package org.example.BuySellStock.repo;

import org.example.BuySellStock.models.User;

public interface IUserRepo {
  public boolean addUser(User user);
  public boolean removeUser(String userId);
  public boolean addUserBalance(String userId, int balance);
  public User getUser(String userId);
  public boolean updateUser(User user);
}
