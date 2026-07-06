package org.example.FlipkartDeliveryService;

public class Main {
  public static void main(String[] args) {
    OrderRepo orderRepo = new OrderRepo();
    AgentPincodeRepo agentPincodeRepo = new AgentPincodeRepo();
    BasicExecutorService executorService = new BasicExecutorService(orderRepo, agentPincodeRepo);
    Orchestrator orchestrator = new Orchestrator(orderRepo, agentPincodeRepo, executorService);

    orchestrator.createAgent("560001", "DriverA");
    orchestrator.createAgent("560001", "DriverB");
    orchestrator.createAgent("560002", "DriverC");

    orchestrator.createOrder("Order1", "560001", "2026-07-05 10:00");
    orchestrator.createOrder("Order2", "560001", "2026-07-05 10:00");
    orchestrator.createOrder("Order3", "560002", "2026-07-05 10:05");
    orchestrator.createOrder("Order4", "560003", "2026-07-05 10:10");

    System.out.println("Starting Flipkart Delivery Service execution...");
    orchestrator.execute();
    System.out.println("Execution completed.");
  }
}
