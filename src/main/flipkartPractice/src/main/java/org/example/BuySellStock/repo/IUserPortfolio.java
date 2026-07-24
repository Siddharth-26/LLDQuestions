package org.example.BuySellStock.repo;

import org.example.BuySellStock.models.User;

public interface IUserPortfolio {
  public boolean updateToUserPortfolio(User user, String symbol, int quantity);
  public boolean removeUserPortfolio(User user);
}
