package PluggablePaymentGateway.registry;

import java.util.HashMap;

import PluggablePaymentGateway.PaymentGateway;
import PluggablePaymentGateway.paymentTypes.PaymentGateways;
import PluggablePaymentGateway.adapters.PayPalPaymentGateway;
import PluggablePaymentGateway.adapters.RazorPayPaymentGateway;
import PluggablePaymentGateway.adapters.StripePaymentGateway;

public class DefaultPaymentRegistry implements PaymentRegistry {
  HashMap<PaymentGateways,PaymentGateway> paymentGatewayHashMap = new HashMap<>();

  public DefaultPaymentRegistry(){
    this.paymentGatewayHashMap.put(PaymentGateways.STRIPE, new StripePaymentGateway());
    this.paymentGatewayHashMap.put(PaymentGateways.PAYPAL, new PayPalPaymentGateway());
    this.paymentGatewayHashMap.put(PaymentGateways.RAZORPAY, new RazorPayPaymentGateway());
  }

  public PaymentGateway getGateway(PaymentGateways gateways) {
    return this.paymentGatewayHashMap.get(gateways);
  }
}
