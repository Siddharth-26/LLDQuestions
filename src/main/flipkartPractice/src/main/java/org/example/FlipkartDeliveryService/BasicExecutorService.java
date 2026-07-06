package org.example.FlipkartDeliveryService;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;

public class BasicExecutorService implements ExecutorService {
  OrderRepo orderRepo;
  AgentPincodeRepo agentRepo;
  DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
  public BasicExecutorService(OrderRepo orderRepo, AgentPincodeRepo agentRepo) {
    this.orderRepo = orderRepo;
    this.agentRepo = agentRepo;
  }
  @Override
  public void execute(List<Order> orders) {
    List<Order> undelivered = new ArrayList<>();
    List<Order> unorderedList = new ArrayList<>(this.orderRepo.getOrders());
    unorderedList.sort(Comparator.comparing(Order::getCreationTime).thenComparing(Order::getOrderName));
    List<String> pincodes = this.agentRepo.getPincodes();
    HashMap<String, PriorityQueue<AgentAvailabilityObj>> pincodeAgentAvailabilityMap = new HashMap<>();
    for(String pincode : pincodes){
      PriorityQueue<AgentAvailabilityObj> pq = new PriorityQueue<>();
      List<Agent> lst = this.agentRepo.getAgents(pincode);
      for(Agent agent : lst){
        pq.offer(new AgentAvailabilityObj(agent));
      }
      pincodeAgentAvailabilityMap.put(pincode, pq);
    }

    for (Order order : unorderedList){
      // Here I have the sorted orderList but I don't have the agents that are required for serving these orders.. Above I have also formed the pq based implementation so that I can get the drivers and orders and then process them.
      String currPincode = order.getPincode();
      PriorityQueue<AgentAvailabilityObj> pq = pincodeAgentAvailabilityMap.get(currPincode);
      if(pq==null){
        undelivered.add(order);
        continue;
      }
      AgentAvailabilityObj agentavailablity = pq.poll();
      String agentName = agentavailablity.getAgent().getAgentName();
      System.out.println(agentName + " - picked up the order" + order.getOrderName() + "at time -" + agentavailablity.nextAvailableTime);
      System.out.println(agentName + " - delivered the order" + order.getOrderName() + "at time -" + agentavailablity.nextAvailableTime +" at the pincode - "+ order.pincode);
      LocalDateTime agentTime = LocalDateTime.parse(agentavailablity.nextAvailableTime,  formatter);
      LocalDateTime orderTime = LocalDateTime.parse(order.creationTime, formatter);
      if(orderTime.isBefore(agentTime)){
        pq.offer(agentavailablity);
      }
      else{
        agentavailablity.nextAvailableTime = order.creationTime;
        pq.offer(agentavailablity);
      }
    }
    System.out.println(undelivered);
  }
}
