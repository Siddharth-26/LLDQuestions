package PubSubSystem;

import java.util.concurrent.ConcurrentHashMap;

public class Main {
  public static void main(String[] args) {
    Subscriber subscriber = new SubscriberImpl();
    Topic topic = new Topic("Cricket", "This is the topic related to everything cricket...");
    Topic topic1 = new Topic("Football", "This is the topic related to everything football...");
    TopicRepo topicRepo = new TopicRepoImpl(new ConcurrentHashMap<>());
    topicRepo.setTopic(topic);
    topicRepo.setTopic(topic1);
    topic1.addSubscriber(subscriber);
    Message message = new Message("Football", "Real Madrid won the El Classico 2-1");
    PublisherService service = new PublisherService(topicRepo);
    service.publishMessage(message);
  }
}
