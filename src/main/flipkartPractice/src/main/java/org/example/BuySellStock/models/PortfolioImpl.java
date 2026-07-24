package org.example.BuySellStock.models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PortfolioImpl implements Portfolio {
  private HashMap<String, Integer> stockMap = new HashMap<>();
  @Override
  public List<String> getStocks() {
    List<String> ans = new  ArrayList<>();
    for(String key : stockMap.keySet()) {
      ans.add(key + " " + this.stockMap.get(key));
    }
    return ans;
  }

  @Override
  public void addStock(String symbol, int quantity) {
    this.stockMap.put(symbol, quantity);
  }

  @Override
  public void updateStock(String symbol, int quantity) {
    int value = this.stockMap.get(symbol);
    this.stockMap.put(symbol, value + quantity);
  }

  @Override
  public boolean checkStock(String symbol) {
    if(stockMap.containsKey(symbol)){
      return true;
    }
    return false;
  }
}
