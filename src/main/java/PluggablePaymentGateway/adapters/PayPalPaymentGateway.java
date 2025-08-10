package PluggablePaymentGateway.adapters;

import java.util.UUID;

import PluggablePaymentGateway.PaymentGateway;
import PluggablePaymentGateway.dto.Request;
import PluggablePaymentGateway.dto.Response;
import PluggablePaymentGateway.thirdPartyNoControl.PayPalAPI;
import PluggablePaymentGateway.thirdPartyNoControl.PayPalPayment;

// Again this is the adapter class that implements the payment Gateway and makes the object based in the
public class PayPalPaymentGateway implements PaymentGateway {

  PayPalAPI payPalAPI;

  public PayPalPaymentGateway(){
    this.payPalAPI = new PayPalAPI();
  }

  @Override
  public Response makePayment(Request request) {
    boolean gatewayResponse = this.payPalAPI.makePayment(new PayPalPayment(request));
    return new Response.Builder().message("Success")
        .status("202").transationID(UUID.randomUUID().toString()).build();
  }
}
