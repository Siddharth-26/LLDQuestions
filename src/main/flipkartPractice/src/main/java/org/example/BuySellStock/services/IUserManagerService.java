package org.example.BuySellStock.services;

import java.util.List;


public interface IUserManagerService {
  public boolean addUser(String userId, String userName, int ballance);
  public boolean updateUser(String userId);
  public boolean removeUser(String user);
  public Integer getWalletBalance(String userId);
  public List<String> getPortfolio(String userId);
  public boolean addWalletBalance(String userId, int amount);
  public boolean removeWalletBalance(String userId, int amount);
}
