package NotificationSDK.client.example;

import java.util.List;

public interface Retry {
  public List<Request> retry();
  public void addFailure(Request request, int time);
}
