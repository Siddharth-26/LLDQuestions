package PluggablePaymentGateway.registry;

import PluggablePaymentGateway.PaymentGateway;
import PluggablePaymentGateway.paymentTypes.PaymentGateways;

public interface PaymentRegistry {
  public PaymentGateway getGateway(PaymentGateways gateways);
}
