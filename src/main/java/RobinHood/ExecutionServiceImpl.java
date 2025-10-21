package RobinHood;

public class ExecutionServiceImpl implements ExecutionService{
  private ThirdPartyExecutionService thirdPartyExecutionService;
  public ExecutionServiceImpl(ThirdPartyExecutionService thirdPartyExecutionService){
    this.thirdPartyExecutionService = thirdPartyExecutionService;
  }
  @Override
  public void addBuyRequest(Stock stock, int amount) {
    this.thirdPartyExecutionService.addBuyRequest(stock, amount);
  }

  @Override
  public void addSellRequest(Stock stock, int amount) {
    this.thirdPartyExecutionService.addSellRequest(stock, amount);
  }
}
