package org.example.FlipkartDeliveryService;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class AgentAvailabilityObj implements Comparable<AgentAvailabilityObj> {
  Agent agent;
  String nextAvailableTime;
  DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
  public AgentAvailabilityObj(Agent agent) {
    this.agent = agent;
    nextAvailableTime = LocalDateTime.now().format(formatter);
  }

  public Agent getAgent() {
    return agent;
  }

  public void setAgent(Agent agent) {
    this.agent = agent;
  }

  public String getNextAvailableTime() {
    return nextAvailableTime;
  }

  public void setNextAvailableTime(String nextAvailableTime) {
    this.nextAvailableTime = nextAvailableTime;
  }

  @Override
  public int compareTo(AgentAvailabilityObj o) {
    LocalDateTime currTime = LocalDateTime.parse(nextAvailableTime, formatter);
    LocalDateTime otherTime = LocalDateTime.parse(o.nextAvailableTime, formatter);
    return currTime.compareTo(otherTime);
  }
}
