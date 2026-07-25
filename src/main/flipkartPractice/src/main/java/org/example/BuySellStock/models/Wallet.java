package org.example.BuySellStock.models;

public interface Wallet {
  public boolean addBalance(int amount);
  public boolean subtractBalance(int amount);
}
