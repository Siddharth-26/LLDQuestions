package org.example.BuySellStock;

import java.util.List;

import org.example.BuySellStock.models.Stocks;
import org.example.BuySellStock.models.User;
import org.example.BuySellStock.services.IStockManagerService;
import org.example.BuySellStock.services.ITransactionManagerService;
import org.example.BuySellStock.services.IUserManagerService;

public class Orchestrator {
  IStockManagerService stockManagerService;
  ITransactionManagerService transactionManagerService;
  IUserManagerService userManagerService;
  public Orchestrator(IStockManagerService stockManagerService, ITransactionManagerService transactionManagerService, IUserManagerService userManagerService) {
    this.stockManagerService = stockManagerService;
    this.transactionManagerService = transactionManagerService;
    this.userManagerService = userManagerService;
  }

  public boolean addStock(Stocks stock){
    return this.stockManagerService.addStock(stock);
  }
  public boolean updateStock(Stocks stock, int price){
    return this.stockManagerService.updateStock(stock, price);
  }
  public boolean removeStock(Stocks stock){
    return this.stockManagerService.removeStock(stock);
  }
  public List<Stocks> listAvaialableStocks(){
    return this.stockManagerService.listAvaialableStocks();
  }
  public boolean buyStocks(String userId, String symbol, int quantity){
    return this.transactionManagerService.buyStocks(userId, symbol, quantity);
  }
  public boolean sellStocks(String userId, String symbol, int quantity){
    return this.transactionManagerService.sellStocks(userId, symbol, quantity);
  }
  public boolean addUser(String userId, String userName , int ballance){
    return this.userManagerService.addUser(userId, userName, ballance);
  }
  public boolean updateUser(String userId){
    return this.userManagerService.updateUser(userId);
  }
  public boolean removeUser(User user){
    return this.userManagerService.removeUser(user);
  }
  public Integer getWalletBalance(String userId){
    return this.userManagerService.getWalletBalance(userId);
  }
  public List<String> getPortfolio(String userId){
    return this.userManagerService.getPortfolio(userId);
  }
}
