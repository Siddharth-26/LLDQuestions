package CoffeeVendingMachine;

import CoffeeVendingMachine.beverages.Beverage;
import CoffeeVendingMachine.beverages.BeverageRegistry;
import CoffeeVendingMachine.beverages.BeverageType;
import CoffeeVendingMachine.payments.Payment;
import CoffeeVendingMachine.payments.PaymentMethod;
import CoffeeVendingMachine.payments.PaymentRegistry;

public class CoffeVendingMachine {
  PaymentRegistry paymentRegistry;
  BeverageRegistry beverageRegistry;
  public CoffeVendingMachine(PaymentRegistry paymentRegistry, BeverageRegistry beverageRegistry){
   this.beverageRegistry = beverageRegistry;
   this.paymentRegistry = paymentRegistry;
  }
  public Beverage prepareBeverage(BeverageType beverageType, PaymentMethod paymentMethod){
    Beverage bev = beverageRegistry.getBeverage(beverageType);
    if(bev!=null) {
      Payment payment = this.paymentRegistry.getPaymentObject(paymentMethod);
      if(payment.pay()){
        return bev;
      }
      else{
        System.out.println("There is something wrong while payment;");
      return null;}
      }
    System.out.println("Ingredients not there for the beverage");
    return null;
  }
}
