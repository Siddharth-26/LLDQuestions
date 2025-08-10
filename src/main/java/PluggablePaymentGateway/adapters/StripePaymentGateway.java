package PluggablePaymentGateway.adapters;

import java.util.UUID;

import PluggablePaymentGateway.PaymentGateway;
import PluggablePaymentGateway.dto.Request;
import PluggablePaymentGateway.dto.Response;
import PluggablePaymentGateway.thirdPartyNoControl.StripeAPI;

public class StripePaymentGateway implements PaymentGateway {

  StripeAPI stripeAPI;


  public StripePaymentGateway(){
    this.stripeAPI = new StripeAPI();
  }

  @Override
  public Response makePayment(Request request) {
    Object gatewayResponse = this.stripeAPI.charge(request.getAmount(), request.getCardNumber());
    // Ideally I will be creating the response based on the gateway response but since I am just telling the approach I am skipping over the minor details..
    Response response = new Response.Builder().message("Success").status("202").transationID(UUID.randomUUID().toString()).build();
    return response;
  }
}
