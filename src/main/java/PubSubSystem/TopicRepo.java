package PubSubSystem;

public interface TopicRepo {
  public Topic getTopic(String topicName);
  public void setTopic(Topic topic);
}
