package RobinHood;

public class OrderPlacementServiceImpl implements OrderPlacementService{
  ExecutionService executionService;
  public OrderPlacementServiceImpl(ExecutionService executionService){
    this.executionService = executionService;
  }
  @Override
  public void placeBuyOrder(Order order) {
    User user = order.getSubscriber();
    int amount = order.getTotalPrice();
    if(user.checkFunds(amount)){
    this.executionService.addBuyRequest(order.getStock(), order.getAmount());
  }
    else{
      System.out.println("There are not enough funds to place this Order" + order.toString());
    }
  }

  @Override
  public void placeSellOrder(Order order) {
    User user = order.getSubscriber();
    int amount = order.getTotalPrice();
    if(user.checkFunds(amount)){
      this.executionService.addSellRequest(order.getStock(), order.getAmount());
    }
    else{
      System.out.println("There are not enough stocks to place this Order" + order.toString());
    }

  }

}
