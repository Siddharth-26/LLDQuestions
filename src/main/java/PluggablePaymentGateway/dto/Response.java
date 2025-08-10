package PluggablePaymentGateway.dto;

public class Response {
  private String message;
  private String transactionID;
  private String status;

  private Response(Builder b){
    this.message = b.message;
    this.transactionID = b.transactionID;
    this.status = b.status;
  }

  public static class Builder{
    private String message;
    private String transactionID;
    private String status;
    public Builder message(String message){
      this.message = message;
      return this;
    }
    public Builder transationID(String transactionID){
      this.transactionID = transactionID;
      return this;
    }
    public Builder status(String status){
      this.status = status;
      return this;
    }
    public Response build(){
      return new Response(this);
    }
  }


}
