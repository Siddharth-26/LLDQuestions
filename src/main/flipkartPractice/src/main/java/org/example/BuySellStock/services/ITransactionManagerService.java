package org.example.BuySellStock.services;

import org.example.BuySellStock.models.User;

public interface ITransactionManagerService {
  public boolean buyStocks(String userId, String symbol, int quantity);
  public boolean sellStocks(String userId, String symbol, int quantity);

}
