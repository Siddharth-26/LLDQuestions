package RobinHood;

public class Orchestrator {
  OrderPlacementService orderPlacementService;
  ExecutionService executionService;
  UserRepo userRepo;
  public Orchestrator(OrderPlacementService orderPlacementService, ExecutionService executionService, UserRepo userRepo){
    this.executionService = executionService;
    this.orderPlacementService = orderPlacementService;
    this.userRepo = userRepo;
  }
  public void createUser( String userName,
      String userEmail,
      String password){
    this.userRepo.createUser(userName, userEmail, password);
  }
  public void placeBuyOrder(Order order){
    this.orderPlacementService.placeBuyOrder(order);
  }
  public void placeSellOrder(Order order){
    this.orderPlacementService.placeSellOrder(order);
  }
}
