package org.example.DeliveryService;

public class Orchestrator {
  OrderRepo orderRepo;
  AgentPincodeRepo agentPincodeRepo;
  BasicExecutorService basicExecutorService;
  public Orchestrator(OrderRepo orderRepo, AgentPincodeRepo agentPincodeRepo, BasicExecutorService basicExecutorService) {
    this.orderRepo = orderRepo;
    this.agentPincodeRepo = agentPincodeRepo;
    this.basicExecutorService = basicExecutorService;
  }
  public void createOrder(String orderName, String pincode, String creationTime){
    Order order  = new Order(orderName, pincode, creationTime);
    this.orderRepo.addOrder(order);
  }

  public void createAgent(String pincode, String agentName){
    Agent agent = new Agent(pincode, agentName);
    this.agentPincodeRepo.addAgent(agent);
  }

  public void execute(){
    this.basicExecutorService.execute(this.orderRepo.getOrders());
  }
}
