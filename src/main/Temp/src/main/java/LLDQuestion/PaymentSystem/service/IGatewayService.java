package LLDQuestion.PaymentSystem.service;

import LLDQuestion.PaymentSystem.model.Currencies;
import LLDQuestion.PaymentSystem.model.IGateway;

public interface IGatewayService {
  public IGateway getGateway(String gatewayId);
  public IGateway updateGateway(IGateway gateway);
  public IGateway addGateway(IGateway gateway);
  public IGateway checkCurrencySupport(Currencies currency);
}
