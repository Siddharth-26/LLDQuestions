package NotificationSDK.client.example;

public class SMSRequest implements Request{
  String message;
  String channel;
  int limit = 160;
  @Override
  public void setChannel() {
    this.channel = "SMS";
  }

  @Override
  public void setMessage(String message) {
    if(checkLimit(message)){
  this.message = message;}
    else{
  // Do something. like throw error send a different status code.
    }
  }

  @Override
  public String getChannel() {
    return "";
  }

  public boolean checkLimit(String message){
    if(message.length()<=this.limit){
      return true;
    }
    return false;
  }
}
