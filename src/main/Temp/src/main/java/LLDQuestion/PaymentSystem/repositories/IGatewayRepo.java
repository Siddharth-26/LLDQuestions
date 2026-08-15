package LLDQuestion.PaymentSystem.repositories;

import LLDQuestion.PaymentSystem.model.IGateway;

public interface IGatewayRepo {
  public IGateway getGateway(String gatewayName);
  public IGateway setGateway(IGateway gateway);
}
