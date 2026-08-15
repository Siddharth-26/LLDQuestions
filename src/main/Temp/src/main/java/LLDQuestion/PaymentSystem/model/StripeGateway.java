package LLDQuestion.PaymentSystem.model;

import java.util.List;

public class StripeGateway implements IGateway {
  private String name;
  private GatewayStatus status;
  private List<Currencies> currencies;
  public StripeGateway(String name, GatewayStatus status, List<Currencies> currencies) {
    this.name = name;
    this.status = status;
    this.currencies = currencies;
  }

  @Override
  public GatewayStatus getGatewayStatus() {
    return this.status;
  }

  @Override
  public void setGatewayStatus(GatewayStatus gatewayStatus) {
    this.status = gatewayStatus;
  }

  public String getName() {
    return name;
  }

  @Override
  public void setName(String name) {
    this.name = name;
  }
  public boolean checkCurrencySupport(Currencies currency) {
    if(this.currencies.contains(currency)) {
      return true;
    }
    return false;
  }

  @Override
  public List<Currencies> getCurrencies() {
    return this.currencies;
  }
}
