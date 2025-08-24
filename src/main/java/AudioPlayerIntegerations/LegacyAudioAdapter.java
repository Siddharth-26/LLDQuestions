package AudioPlayerIntegerations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.google.gson.JsonObject;

public class LegacyAudioAdapter implements AnalyticsService{
  private AnalyticsService analyticsService;
  public LegacyAudioAdapter(AnalyticsService analyticsService){
    this.analyticsService = analyticsService;
  }
  @Override
  public void logEvent(JsonObject jsonObect) {
    this.analyticsService.logEvent(jsonObect);
  }
  public void logEvent(String string){
    List<String> lst = new ArrayList<>();
    lst = Arrays.asList(string.split(";"));
    JsonObject jsonObject = new JsonObject();
    jsonObject.addProperty("id", lst.get(0));
    jsonObject.addProperty("action", lst.get(1));
    jsonObject.addProperty("timestamp", lst.get(2));
    this.logEvent(jsonObject);
  }
}
