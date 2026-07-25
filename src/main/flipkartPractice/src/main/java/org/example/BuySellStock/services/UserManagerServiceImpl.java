package org.example.BuySellStock.services;

import java.util.List;

import org.example.BuySellStock.models.User;
import org.example.BuySellStock.models.UserImpl;
import org.example.BuySellStock.repo.IUserPortfolio;
import org.example.BuySellStock.repo.IUserRepo;

public class UserManagerServiceImpl implements IUserManagerService {
  IUserRepo userRepo;
  IUserPortfolio userPortfolio;
  public UserManagerServiceImpl(IUserRepo userRepo,  IUserPortfolio userPortfolio) {
    this.userRepo = userRepo;
    this.userPortfolio = userPortfolio;
  }
  @Override
  public boolean addUser(String userId, String userName, int ballance) {
    User user = new UserImpl(userId, userName, ballance);
    return this.userRepo.addUser(user);
  }

  @Override
  public boolean updateUser(String userId) {
    User user  = this.userRepo.getUser(userId);
    this.userRepo.updateUser(user);
    return true;
  }

  @Override
  public boolean removeUser(String user) {
    return this.userRepo.removeUser(user);
  }

  @Override
  public Integer getWalletBalance(String userId) {
    return this.userRepo.getUser(userId).getWalletBalance();
  }

  @Override
  public List<String> getPortfolio(String userId) {
    return this.userPortfolio.getUserPortfolio(userId).getStocks();
  }

  @Override
  public boolean addWalletBalance(String userId, int amount) {
    User user = this.userRepo.getUser(userId);
    return user.addWalletBalance(amount);
  }

  @Override
  public boolean removeWalletBalance(String userId, int amount) {
    User user = this.userRepo.getUser(userId);
    return user.removeWalletBalance(amount);
  }
}
