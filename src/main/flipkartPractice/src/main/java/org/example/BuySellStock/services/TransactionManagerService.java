package org.example.BuySellStock.services;

import org.example.BuySellStock.models.Stocks;
import org.example.BuySellStock.models.User;
import org.example.BuySellStock.repo.IStockPriceMap;
import org.example.BuySellStock.repo.IUserRepo;

public class TransactionManagerService implements ITransactionManagerService {
  IUserRepo userRepo;
  IStockPriceMap stockPriceMap;
  public TransactionManagerService(IUserRepo userRepo,  IStockPriceMap stockPriceMap) {
    this.userRepo = userRepo;
    this.stockPriceMap = stockPriceMap;
  }
  @Override
  public boolean buyStocks(String userId, String symbol, int quantity) {
    User user = this.userRepo.getUser(userId);
    Stocks stocks = this.stockPriceMap.getStockBySymbol(symbol);
    if (stocks == null) {
      return false;
    }
    else{
      int amount = quantity*stocks.getStockPrice();
      if(user.removeWalletBalance(amount)){
        return true;
      }
      return false;
    }
  }

  @Override
  public boolean sellStocks(String userId, String symbol, int quantity) {
    User user = this.userRepo.getUser(userId);
    Stocks stocks = this.stockPriceMap.getStockBySymbol(symbol);
    if (stocks == null) {
      return false;
    }
    else{
      int amount = quantity*stocks.getStockPrice();
      if(user.addWalletBalance(amount)){
        return true;
      }
      return false;
    }
  }
}
