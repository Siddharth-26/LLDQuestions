package org.example.BuySellStock.services;

import java.util.List;

import org.example.BuySellStock.models.Stocks;
import org.example.BuySellStock.repo.IStockPriceMap;

public class StockManagerServiceImpl implements IStockManagerService {
  private IStockPriceMap stockPriceMap;
  public StockManagerServiceImpl(IStockPriceMap stockPriceMap) {
    this.stockPriceMap = stockPriceMap;
  }
  @Override
  public boolean addStock(Stocks stock) {
    return this.stockPriceMap.addStock(stock);
  }

  @Override
  public boolean updateStock(Stocks stock, int price) {
    return false;
  }

  @Override
  public boolean removeStock(Stocks stock) {
    return false;
  }

  @Override
  public List<Stocks> listAvaialableStocks() {
    return List.of();
  }
}
