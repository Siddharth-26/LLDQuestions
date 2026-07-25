package org.example.BuySellStock.models;

import java.util.concurrent.atomic.AtomicInteger;

public class WalletImpl implements Wallet {
  private String userId;
  private int balance;
  public WalletImpl(String userId, int balance) {
    this.userId = userId;
    this.balance = balance;
  }
  @Override
  public synchronized boolean addBalance(int amount) {
    this.balance+=amount;
    return true;
  }

  @Override
  public synchronized boolean subtractBalance(int amount) {
    if(this.balance < amount) {
      return false;
    }
    this.balance-=amount;
    return true;
  }
}
