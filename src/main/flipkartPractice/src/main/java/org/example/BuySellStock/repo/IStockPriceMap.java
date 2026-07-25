package org.example.BuySellStock.repo;

import org.example.BuySellStock.models.Stocks;

public interface IStockPriceMap {
  public boolean addStock(Stocks stock);
  public boolean removeStock(Stocks stock);
  public boolean updateStock(Stocks stock);
  public Stocks getStockBySymbol(String symbol);
}
