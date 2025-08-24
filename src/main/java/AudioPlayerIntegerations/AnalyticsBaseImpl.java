package AudioPlayerIntegerations;

import com.google.gson.JsonObject;

public class AnalyticsBaseImpl implements AnalyticsService{
  @Override
  public void logEvent(JsonObject jsonObect) {
    System.out.println(jsonObect.toString());
  }
}
