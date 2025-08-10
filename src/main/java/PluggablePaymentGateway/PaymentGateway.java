package PluggablePaymentGateway;

import PluggablePaymentGateway.dto.Request;
import PluggablePaymentGateway.dto.Response;

public interface PaymentGateway {
  public Response makePayment(Request request);
}
