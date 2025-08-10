package PluggablePaymentGateway.adapters;

import java.util.UUID;

import PluggablePaymentGateway.PaymentGateway;
import PluggablePaymentGateway.dto.Request;
import PluggablePaymentGateway.dto.Response;
import PluggablePaymentGateway.thirdPartyNoControl.RazorPayAPI;
import PluggablePaymentGateway.thirdPartyNoControl.RazorpayOrder;

public class RazorPayPaymentGateway implements PaymentGateway {
  RazorPayAPI razorPayAPI;
  public RazorPayPaymentGateway(){
    this.razorPayAPI = new RazorPayAPI();

  }

  @Override
  public Response makePayment(Request request) {
    boolean gatewayResponse = razorPayAPI.pay(new RazorpayOrder(request));
    // Only happy flow based on the gateway response this must be changed but since this is a LLD round I am just going through the positive flow.
    return new Response.Builder().transationID(UUID.randomUUID().toString()).status("202").message("Success Transaction").build();
  }
}
