package PluggablePaymentGateway.dto;

import PluggablePaymentGateway.currencytypes.Currency;
import PluggablePaymentGateway.paymentTypes.PaymentGateways;

public class Request {
  private PaymentGateways paymentMethod;
  private float amount;
  private Currency currency;
  private String CardNumber;
  private String UPI_ID;
  private String StripeFromID;
  private String RazorPayFromID;
  private String StripToID;
  private String RazorPayToID;
  private String accountNumber;

  public PaymentGateways getPaymentMethod() {
    return paymentMethod;
  }

  public float getAmount() {
    return amount;
  }

  public Currency getCurrency() {
    return currency;
  }

  public String getCardNumber() {
    return CardNumber;
  }

  public String getUPI_ID() {
    return UPI_ID;
  }

  public String getStripeFromID() {
    return StripeFromID;
  }

  public String getRazorPayFromID() {
    return RazorPayFromID;
  }

  public String getStripToID() {
    return StripToID;
  }

  public String getRazorPayToID() {
    return RazorPayToID;
  }

  public String getAccountNumber() {
    return accountNumber;
  }

  private Request(Builder b){
    this.paymentMethod = b.paymentMethod;
    this.amount = b.amount;
    this.currency = b.currency;
    this.CardNumber = b.CardNumber;
    this.UPI_ID = b.UPI_ID;
    this.StripeFromID = b.StripeFromID;
    this.RazorPayFromID = b.RazorPayFromID;
    this.StripToID = b.StripToID;
    this.RazorPayToID = b.RazorPayToID;
    this.accountNumber = b.accountNumber;
  }

  private static class  Builder{
    private PaymentGateways paymentMethod;
    private float amount;
    private Currency currency;
    private String CardNumber;
    private String UPI_ID;
    private String StripeFromID;
    private String RazorPayFromID;
    private String StripToID;
    private String RazorPayToID;
    private String accountNumber;

    public Builder paymentMethod(PaymentGateways paymentMethod){
      this.paymentMethod = paymentMethod;
      return this;
    }
    public Builder amount(float amount){
      this.amount = amount;
      return this;
    }
    public Builder currency(Currency currency){
      this.currency = currency;
      return this;
    }
    public Builder CardNumber(String CardNumber){
      this.CardNumber = CardNumber;
      return this;
    }
    public Builder UPI_ID(String UPI_ID){
      this.UPI_ID = UPI_ID;
      return this;
    }
    public Builder StripeFromID(String StripeFromID){
      this.StripeFromID = StripeFromID;
      return this;
    }
    public Builder RazorPayFromID(String RazorPayFromID){
      this.RazorPayFromID = RazorPayFromID;
      return this;
    }
    public Builder StripToID(String StripToID){
      this.StripToID = StripToID;
      return this;
    }
    public Builder RazorPayToID(String RazorPayToID){
      this.RazorPayToID = RazorPayToID;
      return this;
    }
    public Builder accountNumber(String accountNumber){
      this.accountNumber = accountNumber;
      return this;
    }

    public Request build(){
      return new Request(this);
    }

  }

}
