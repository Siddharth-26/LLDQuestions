package org.example.BuySellStock.repo;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

import org.example.BuySellStock.models.Stocks;

public class StockRepoImpl implements IStockPriceMap{
  private ConcurrentHashMap<String, Stocks> stockPriceMap;
  public StockRepoImpl() {
    this.stockPriceMap = new ConcurrentHashMap();
  }
  @Override
  public boolean addStock(Stocks stock) {
    this.stockPriceMap.compute(stock.getStockSymbol(), (key, value) -> {
        if(value==null){
          return stock;
    }
        else{
          value.setStockPrice(stock.getStockPrice());
          return value;
    }
    });
    return true;
  }
  @Override
  public boolean removeStock(Stocks stock) {
    AtomicBoolean result = new AtomicBoolean(false);
    this.stockPriceMap.computeIfPresent(stock.getStockSymbol(), (key, value)->{
      if(value!=null){
        result.set(true);
        return null;
      }
      return null;
    });
    return result.get();
  }

  @Override
  public boolean updateStock(Stocks stock) {
    AtomicBoolean result = new AtomicBoolean(false);
    this.stockPriceMap.computeIfPresent(stock.getStockSymbol(), (key, value)->{
      if(value==null){
        return null;
      }
      else{
      value.setStockPrice(stock.getStockPrice());
      result.set(true);
      return value;
      }
    });
    return result.get();
  }

  @Override
  public Stocks getStockBySymbol(String symbol) {
    return this.stockPriceMap.computeIfPresent(symbol, (key, value)->{
      return value;
    });
  }
}
