package AlertandChannelsFramework.dtos;

public class Response {
  private String status;
  private String message;
  private int Id;

  public Response(Builder b){
    this.status = b.status;
    this.message = b.message;
    this.Id = b.Id;
  }
  public String getStatus() {
    return status;
  }

  public String getMessage() {
    return message;
  }
  public static class Builder{
    private String status;
    private String message;
    private int Id;
    public Builder status(String status){
      this.status = status;
      return this;
    }
    public Builder message(String message){
      this.message = message;
      return this;
    }
    public Builder Id(int Id){
      this.Id = Id;
      return this;
    }
    public Response build(){
      return new Response(this);
    }

  }
}
