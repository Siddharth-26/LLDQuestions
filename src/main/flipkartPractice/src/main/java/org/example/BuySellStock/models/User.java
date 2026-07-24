package org.example.BuySellStock.models;

public interface User {
  public String getUserName();
  public String getUserId();
  public boolean updateUserName(String userName);
  public boolean updateUserId(String userId);
  public int getWalletBalance();
  public boolean addWalletBalance(int walletBalance);
  public boolean removeWalletBalance(int walletBalance);
}
