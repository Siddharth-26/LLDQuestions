package RobinHood;

public interface ExecutionService {
  public void addBuyRequest(Stock stock, int amount);
  public void addSellRequest(Stock stock, int amount);
}
