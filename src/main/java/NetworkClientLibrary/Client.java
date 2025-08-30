package NetworkClientLibrary;

import java.util.HashMap;

public class Client {
  public static void main(String[] args){
    HttpRequest getRequest = new HttpRequest.Builder().url("www.google.com").method(HttpMethods.GET).build();
    HashMap<String, String> headers = new HashMap<>();
    headers.put("content-type", "html");
    headers.put("maxLimit", "200GB");
    HttpRequest postRequest = new HttpRequest.Builder().url("www.google.com").method(HttpMethods.POST).headers(headers).body("This is a test post request").timeout(2000).build();
    System.out.println(getRequest);
    System.out.println(postRequest);
  }
}
