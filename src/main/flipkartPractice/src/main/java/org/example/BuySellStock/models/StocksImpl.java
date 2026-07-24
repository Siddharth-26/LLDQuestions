package org.example.BuySellStock.models;

import java.util.concurrent.atomic.AtomicInteger;

public class StocksImpl implements Stocks {
  private AtomicInteger stockPrice;
  private String stockSymbol;
  @Override
  public int getStockPrice() {
    return this.stockPrice.get();
  }

  @Override
  public String getStockSymbol() {
    return this.stockSymbol;
  }

  @Override
  public boolean setStockPrice(int stockPrice) {
    this.stockPrice = new AtomicInteger(stockPrice);
    return true;
  }
}
