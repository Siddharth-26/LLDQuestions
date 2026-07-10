package org.example.BNPL;

public class UserManager {
  UserRepo userRepo;
  public void registerUser(String userName, int creditLimit){
    Users newUser = new Users(userName, creditLimit);
    this.userRepo.addUser(newUser);
  }
  public boolean verifyUser(String userName){
    if(this.userRepo.hasUser(userName)){
      Users user = this.userRepo.getUser(userName);
      if(user.checkUserBlackListed()){
        return false;
      }
      return true;
    }
    return false;
  }
}
