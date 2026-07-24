package org.example.BuySellStock.models;

import java.util.List;

public interface Portfolio {
  public List<String> getStocks();
  public void addStock(String symbol, int quantity);
  public void updateStock(String symbol, int quantity);
  public boolean checkStock(String symbol);
}
