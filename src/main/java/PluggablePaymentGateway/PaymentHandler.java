package PluggablePaymentGateway;

import PluggablePaymentGateway.dto.Request;
import PluggablePaymentGateway.dto.Response;
import PluggablePaymentGateway.registry.PaymentRegistry;

public class PaymentHandler {
  PaymentRegistry registry;

  public PaymentHandler(PaymentRegistry registry){
    this.registry = registry;
  }

  public Response makePayment(Request request){
    PaymentGateway gateway = this.registry.getGateway(request.getPaymentMethod());
    return gateway.makePayment(request);
  }
}
