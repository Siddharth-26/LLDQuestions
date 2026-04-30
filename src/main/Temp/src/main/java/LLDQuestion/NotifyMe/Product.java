package LLDQuestion.NotifyMe;

import java.util.ArrayList;
import java.util.List;

public class Product implements Publisher{
  private int productId;
  private String productName;
  private List<Subscriber> subscriberList;
  public Product(int productId, String productName){
    this.productId = productId;
    this.productName = productName;
    this.subscriberList = new ArrayList<>();
  }
  @Override
  public void sendNotification(String message) {
    // I am sending the same message but the message might be different based on different channel like email will be very different from SMS.
    for(Subscriber subscriber : this.subscriberList){
      subscriber.sendNotification(message);
    }
  }

  @Override
  public void addSubscriber(Subscriber subscriber) {
    this.subscriberList.add(subscriber);
  }

  @Override
  public void removeSubscriber(Subscriber subscriber) {
    this.subscriberList.remove(subscriber);
  }
}
