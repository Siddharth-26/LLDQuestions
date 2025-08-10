package PluggablePaymentGateway.thirdPartyNoControl;
// This is a class mimicking the Stripe 3rd party API...
public class StripeAPI {
  public Object charge(float amountInUsd, String cardNumber){
    System.out.println("Processing the payment via Stripe");
    //This object will be the response object that Strip API returns...
    return new Object();
  }
}
