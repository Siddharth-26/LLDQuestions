package PubSubSystem;

public class PublisherService {
  private TopicRepo topicRepo;

  public PublisherService(TopicRepo topicRepo) {
    this.topicRepo = topicRepo;
  }

  public void publishMessage(Message message){
    Topic topic  = this.topicRepo.getTopic(message.getTopic());
    topic.publishMessage(message);
  }
}
