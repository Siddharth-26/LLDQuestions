package org.example.BNPL;

public class Users {
  String userId;
  int creditLimit;
  boolean isBlaclisted = false;
  public Users(String userId, int creditLimit){
    this.userId = userId;
    this.creditLimit = creditLimit;
  }
  public synchronized boolean checkAndDecrementCreditLimit(int amount){
    if(this.creditLimit < amount){
      return false;
    }
    this.creditLimit-=amount;
    return true;
  }
  public synchronized boolean increaseCreditLimit(int amount){
    this.creditLimit += amount;
    return true;
  }
  public boolean checkUserBlackListed(){
    this.isBlaclisted = true;
    return true;
  }
  private void makeUserBlackListed(){
    this.isBlaclisted = true;
  }
}
