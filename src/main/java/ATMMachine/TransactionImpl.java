package ATMMachine;

import java.util.HashMap;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.concurrent.ConcurrentHashMap;

public class TransactionImpl implements Transaction{
  ConcurrentHashMap<String, Integer> bankbalance;
  ConcurrentHashMap<String,HashMap<String, String>> credentials;
  HashMap<String, User> userMapping;
  public TransactionImpl(ConcurrentHashMap<String, Integer> bankDatabase, ConcurrentHashMap<String,HashMap<String, String>> credentials, HashMap<String, User> userMapping){
    this.bankbalance = bankDatabase;
    this.credentials = credentials;
    this.userMapping = userMapping;
  }

  @Override
  public User authenticate(String CardNumber, String pin) {
   HashMap<String, String> map = this.credentials.get(CardNumber);
   if(map!=null){
     String userId = map.get(pin);
     return this.userMapping.get(userId);
   }
   else{
     return null;
   }
  }

  @Override
  public Optional<Integer> getBalance(String userID) {
    Integer balance =  this.bankbalance.get(userID);
    return Optional.of(balance);
  }

  @Override
  public OptionalInt withdrawAmount(String userID, int amount) {
    Integer previousVal = this.bankbalance.get(userID);
    Integer newBalance = this.bankbalance.compute(userID, (key, value)->{
      if(value>=amount){
        value-=amount;
      }
      System.out.println("There is not enough balance");
      return value;
    });
    if(!Objects.equals(previousVal, newBalance)){
      return OptionalInt.of(newBalance);
    }
    else{
      return OptionalInt.empty();
    }
  }

  @Override
  public OptionalInt depositAmount(String userId, int amount) {
    Integer previousVal = this.bankbalance.get(userId);
    Integer newBalance = this.bankbalance.compute(userId, (key, value)->{
      if(value>=amount){
        value-=amount;
      }
      System.out.println("Cannot deposit because too many people trying to deposit in the same account");
      return value;
    });
    if(!Objects.equals(previousVal, newBalance)){
      return OptionalInt.of(newBalance);
    }
    else{
      return OptionalInt.empty();
    }
  }
}
