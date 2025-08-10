package PluggablePaymentGateway;

// This is an orchestrator class might have other methods like Rate Limit checks etc... But Keeping it separate from the Handler although for the time being it is just routing the request to the Handler.

import PluggablePaymentGateway.dto.Request;
import PluggablePaymentGateway.dto.Response;

public class OrchestratorService {

  PaymentHandler handler;

  public OrchestratorService(PaymentHandler handler){
    this.handler = handler;
  }

  public Response pay(Request request){

    return this.handler.makePayment(request);
  }



}
