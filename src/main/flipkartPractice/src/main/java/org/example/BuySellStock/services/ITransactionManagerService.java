package org.example.BuySellStock.services;


public interface ITransactionManagerService {
  public boolean buyStocks(String userId, String symbol, int quantity);
  public boolean sellStocks(String userId, String symbol, int quantity);

}
