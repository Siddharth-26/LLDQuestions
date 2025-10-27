package PubSubSystem;

import java.util.ArrayList;
import java.util.List;

public class Topic implements Publisher{
  private String topicName;
  private String description;
  private List<Subscriber> subscriberList;

  public Topic(String topicName, String description) {
    this.topicName = topicName;
    this.description = description;
    this.subscriberList = new ArrayList<>();
  }

  public String getTopicName() {
    return topicName;
  }

  public void setTopicName(String topicName) {
    this.topicName = topicName;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  @Override
  public void publishMessage(Message message) {
    for(Subscriber x:this.subscriberList){
      x.notifySubscriber(message);
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
