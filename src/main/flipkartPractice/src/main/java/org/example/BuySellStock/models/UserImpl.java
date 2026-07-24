package org.example.BuySellStock.models;

import java.util.concurrent.atomic.AtomicInteger;

public class UserImpl implements User {
  private String userName;
  private String userId;
  private AtomicInteger walletBalance = new AtomicInteger(0);
  public UserImpl(String userName, String userId, int walletBalance) {
    this.userName = userName;
    this.walletBalance.set(walletBalance);
  }
  @Override
  public String getUserName() {
    return this.userName;
  }

  @Override
  public String getUserId() {
    return this.userId;
  }

  @Override
  public boolean updateUserName(String userName) {
    this.userName = userName;
    return true;
  }

  @Override
  public boolean updateUserId(String userId) {
    this.userId = userId;
    return true;
  }

  @Override
  public int getWalletBalance() {
    return this.walletBalance.get();
  }

  @Override
  public boolean addWalletBalance(int walletBalance) {
    this.walletBalance.addAndGet(walletBalance);
    return true;
  }

  @Override
  public boolean removeWalletBalance(int walletBalance) {
    if(this.walletBalance.get()>=walletBalance) {
      this.walletBalance.addAndGet(-walletBalance);
      return true;
    }
    return false;
  }
}
