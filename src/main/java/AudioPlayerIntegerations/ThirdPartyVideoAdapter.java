package AudioPlayerIntegerations;

import com.google.gson.JsonObject;
import org.jdom2.Document;
import org.jdom2.Element;

public class ThirdPartyVideoAdapter implements AnalyticsService{

  private AnalyticsService analyticsServiceObj;

  public ThirdPartyVideoAdapter(AnalyticsService analyticsService){
    this.analyticsServiceObj = analyticsService;
  }

  @Override
  public void logEvent(JsonObject jsonObect) {
    this.analyticsServiceObj.logEvent(jsonObect);
  }
  public void logEvent(Document document){
    // Format to jsonObject and call the method.
    JsonObject object = new JsonObject();
    Element root = document.getRootElement();
    object.addProperty("id", root.getChildText("id"));
    object.addProperty("action", root.getChildText("action"));
    this.logEvent(object);
  }
}
