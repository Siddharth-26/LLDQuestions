package LLDQuestion.PaymentSystem.repositories;

import java.util.concurrent.ConcurrentHashMap;

import LLDQuestion.PaymentSystem.model.IGateway;

public class GatewayRepo implements IGatewayRepo{
  private ConcurrentHashMap<String, IGateway> gateways;
  public GatewayRepo() {
    gateways = new ConcurrentHashMap<>();
  }
  @Override
  public IGateway getGateway(String gatewayName) {
    if(this.gateways.containsKey(gatewayName)){
      return this.gateways.get(gatewayName);
    }
    return null;
  }

  @Override
  public IGateway setGateway(IGateway gateway) {
    IGateway value = this.gateways.computeIfAbsent(gateway.getName(), key -> gateway);
    return value;
  }
}
