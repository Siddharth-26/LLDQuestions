package org.example.BuySellStock.repo;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

import org.example.BuySellStock.models.Portfolio;
import org.example.BuySellStock.models.PortfolioImpl;
import org.example.BuySellStock.models.User;

public class UserPortfolioImpl implements IUserPortfolio{
  private ConcurrentHashMap<String,Portfolio> userPortfolioMap = new  ConcurrentHashMap<>();
  @Override
  public boolean updateToUserPortfolio(User user, String symbol, int quantity) {
  Portfolio storedVal = this.userPortfolioMap.compute(user.getUserId(), (key, value)-> {
    if (value == null) {
      Portfolio val = new PortfolioImpl();
      val.addStock(symbol, quantity);
      return val;
    } else {
      if (value.checkStock(symbol)) {
        value.updateStock(symbol, quantity);
        return value;
      }
      else{
        value.addStock(symbol, quantity);
        return value;
      }
    }
  });
  if(storedVal!=null){
    return true;
  }
  return false;
  }

  @Override
  public boolean removeUserPortfolio(User user) {
    AtomicBoolean result = new AtomicBoolean(false);
    this.userPortfolioMap.computeIfPresent(user.getUserId(), (key, value)->{
      if(value!=null){
        result.set(true);
      }
      return null;
    });
    return  result.get();
  }

  @Override
  public Portfolio getUserPortfolio(String userId) {
    return this.userPortfolioMap.get(userId);
  }
}
