package org.example.BuySellStock.repo;

import java.util.List;

import org.example.BuySellStock.models.Portfolio;
import org.example.BuySellStock.models.User;

public interface IUserPortfolio {
  public boolean updateToUserPortfolio(User user, String symbol, int quantity);
  public boolean removeUserPortfolio(User user);
  public Portfolio getUserPortfolio(String userId);
}
