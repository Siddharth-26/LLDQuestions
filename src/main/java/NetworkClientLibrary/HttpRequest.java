package NetworkClientLibrary;

import java.util.HashMap;

public class HttpRequest {
  private String url;
  private HttpMethods method;
  private HashMap<String, String> headers;
  private String body;
  private int timeout;

  public String getUrl() {
    return url;
  }

  public HttpMethods getMethod() {
    return method;
  }

  public HashMap<String,String> getHeaders() {
    return headers;
  }

  public String getBody() {
    return body;
  }

  public int getTimeout() {
    return timeout;
  }

  private HttpRequest(Builder b){
    this.url = b.url;
    this.method = b.method;
    this.headers = b.headers;
    this.body = b.body;
    this.timeout = b.timeout;
  }

  public static class Builder{
    private  String url;
    private HttpMethods method;
    private HashMap<String, String> headers;
    private String body;
    private int timeout;
    public Builder url(String url){
      this.url = url;
      return this;
    }
    public Builder method(HttpMethods method){
      this.method = method;
      return this;
    }
    public Builder headers(HashMap<String, String> headers){
      this.headers = headers;
      return this;
    }
    public Builder body(String body){
      this.body = body;
      return this;
    }
    public Builder timeout(int timeout){
      this.timeout = timeout;
      return this;
    }
    public HttpRequest build(){
      if(this.url==null || this.method==null){
        System.out.println("INcorrect Input");
        return null;
      }
      else {
        return new HttpRequest(this);
      }
    }
  }

  @Override
  public String toString() {
    return "HttpRequest{" + "url='" + url + '\'' + ", method=" + method + ", headers=" + headers +
        ", body='" + body + '\'' + ", timeout=" + timeout + '}';
  }
}
