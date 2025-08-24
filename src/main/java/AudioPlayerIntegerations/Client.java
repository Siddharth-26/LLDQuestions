package AudioPlayerIntegerations;

import org.jdom2.Document;

public class Client {
  public static void main(String[] args){
    LegacyAudioPlayer legacyAudioPlayer = new LegacyAudioPlayer();
    String output = legacyAudioPlayer.playAudio();
    LegacyAudioAdapter legacyAnalytics = new LegacyAudioAdapter(new AnalyticsBaseImpl());
    legacyAnalytics.logEvent(output);
    ThirdPartyVideoPlayer thirdPartyVideoPlayer = new ThirdPartyVideoPlayer();
    Document doc = thirdPartyVideoPlayer.playVideo();
    ThirdPartyVideoAdapter thirdPartyAnalytics = new ThirdPartyVideoAdapter(new AnalyticsBaseImpl());
    thirdPartyAnalytics.logEvent(doc);
  }
}
