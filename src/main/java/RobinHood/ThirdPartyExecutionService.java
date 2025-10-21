package RobinHood;
// This is a service that is matching the orders this will be using our Notification Service to notify the users for their order updates...
public interface ThirdPartyExecutionService {
  public void addBuyRequest(Stock stock, int amount);
  public void addSellRequest(Stock stock, int amount);
}
