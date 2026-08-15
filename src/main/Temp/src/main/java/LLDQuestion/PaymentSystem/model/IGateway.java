package LLDQuestion.PaymentSystem.model;

import java.util.List;

public interface IGateway {
  public GatewayStatus getGatewayStatus();
  public void setGatewayStatus(GatewayStatus gatewayStatus);
  public String getName();
  public void setName(String name);
  public boolean checkCurrencySupport(Currencies currency);
  public List<Currencies> getCurrencies();
}
