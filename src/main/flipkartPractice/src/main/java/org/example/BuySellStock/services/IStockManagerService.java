package org.example.BuySellStock.services;

import java.util.List;

import org.example.BuySellStock.models.Stocks;

public interface IStockManagerService {
  public boolean addStock(Stocks stock);
  public boolean updateStock(Stocks stock, int price);
  public boolean removeStock(Stocks stock);
  public List<Stocks> listAvaialableStocks();
}
