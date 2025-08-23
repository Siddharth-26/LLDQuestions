package LiveScoreSystem;

import java.util.ArrayList;
import java.util.List;

public abstract class Publisher {
  List<Subscriber> subscriberList;
  public Publisher(){
    this.subscriberList = new ArrayList<>();
  }
  public void subscribe(Subscriber subscriber){
    this.subscriberList.add(subscriber);
  }
  public void remove(Subscriber subscriber){
    this.subscriberList.remove(subscriber);
  }
  public void notifySubscribers(Score score){
    for (Subscriber x: this.subscriberList) {
      x.update(score);
    }
  }
}
