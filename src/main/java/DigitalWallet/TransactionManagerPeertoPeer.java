package DigitalWallet;

import java.util.concurrent.ConcurrentHashMap;

public class TransactionManagerPeertoPeer implements Transaction{
  ConcurrentHashMap<String, User> userDatabase;
  ConcurrentHashMap<String, Account> accountDatabase;
  public TransactionManagerPeertoPeer(ConcurrentHashMap<String, User> userDatabase, ConcurrentHashMap<String, Account> accountDatabase){
    this.accountDatabase = accountDatabase;
    this.userDatabase = userDatabase;
  }
  @Override
  public boolean transferMoney(User user1, User user2, int amount) {
    try{
      String accountId1 = user1.getPrimaryAccount();
      String accountId2 = user2.getPrimaryAccount();
      Object lock1;
      Object lock2;
      if(accountId1.hashCode()>accountId2.hashCode()){
        lock1 = this.accountDatabase.get(accountId2);
        lock2 = this.accountDatabase.get(accountId1);
      }
      else{
        lock1 = this.accountDatabase.get(accountId1);
        lock2 = this.accountDatabase.get(accountId2);
      }
      synchronized (lock1){
        synchronized (lock2){
          Account sender = this.accountDatabase.get(accountId1);
          Account receiver = this.accountDatabase.get(accountId2);
          if(sender.getAmount()>=amount){
            sender.setAmount(sender.getAmount()-amount);
            receiver.setAmount(receiver.getAmount()+amount);
            return true;
          }
          else{
            return false;
          }
        }
      }
    }
    catch (Exception e){
      return false;
    }
  }
}
