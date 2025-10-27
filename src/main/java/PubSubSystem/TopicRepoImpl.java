package PubSubSystem;

import java.util.concurrent.ConcurrentHashMap;

public class TopicRepoImpl implements TopicRepo{
  private ConcurrentHashMap<String, Topic> topicMapping;

  public TopicRepoImpl(ConcurrentHashMap<String,Topic> topicMapping) {
    this.topicMapping = topicMapping;
  }

  @Override
  public Topic getTopic(String topicName) {
    return this.topicMapping.get(topicName);
  }

  @Override
  public void setTopic(Topic topic) {
    this.topicMapping.put(topic.getTopicName(), topic);
    System.out.println("aksdflaksdnfasd"+ topic.getTopicName());
  }
}
