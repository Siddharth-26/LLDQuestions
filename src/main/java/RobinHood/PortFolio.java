package RobinHood;

public interface PortFolio {
  public void addToPortfolio(Stock stock, int amount);
  public void removeFromPortfolio(Stock stock, int amount);
  public void getAllStocks();
  public int getStockCount(Stock stock);
  public void blockStocks(Stock stock, int amount);
}
