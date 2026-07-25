package org.example.BuySellStock.repo;

import org.example.BuySellStock.models.WalletImpl;

public interface WalletRepo {
  public boolean addUserWallet(String userId, WalletImpl wallet);
  public WalletImpl getUserWallet(String userId);
  public boolean updateUserWallet(String userId, WalletImpl wallet);
}
