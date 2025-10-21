package RobinHood;

import java.util.HashMap;

public class PortFolioImpl implements PortFolio{
  private HashMap<String, Integer> folio;
  private String userId;
  private HashMap<String, Integer> blockedStocks;

  public PortFolioImpl(String userId) {
    this.userId = userId;
    this.folio = new HashMap<>();
  }

  @Override
  public synchronized void addToPortfolio(Stock stock, int amount) {
    if(this.folio.containsKey(stock.getName())){
      this.folio.compute(stock.getName(), (k, value) -> value + amount);
    }
    else{
      this.folio.put(stock.getName(), amount);
    }
  }

  @Override
  public synchronized void removeFromPortfolio(Stock stock, int amount) {
    int value = this.folio.get(stock.getName());
    if(amount==value){
      this.folio.remove(stock.getName());
    }
    else{
      this.folio.put(stock.getName(), value-amount);
    }
  }

  @Override
  public void getAllStocks() {
    System.out.println(this.folio);

  }

  @Override
  public int getStockCount(Stock stock) {
    if(this.folio.containsKey(stock.getName())){
    return this.folio.get(stock.getName());
  }
    else{
      return 0;
    }
  }

  @Override
  public void blockStocks(Stock stock, int amount) {
    if(this.blockedStocks.containsKey(stock.getName())){
      int value = this.blockedStocks.get(stock.getName());
      this.blockedStocks.put(stock.getName(), value+amount);
    }
    else{
      this.blockedStocks.put(stock.getName(), amount);
    }
  }

}
