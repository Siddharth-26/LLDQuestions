package DigitalWallet;

public class CreditCardPaymentMethod implements PaymentMethod{
  private String creditCard;
  public CreditCardPaymentMethod(String creditCard){
    this.creditCard = creditCard;
  }
  @Override
  public String getPaymentMethodDetails() {
  return this.creditCard;
  }
}
