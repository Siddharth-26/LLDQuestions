package org.example.BuySellStock.repo;

import org.example.BuySellStock.models.User;

public interface IUserRepo {
  public boolean addUser(User user);
  public boolean removeUser(User user);
}
