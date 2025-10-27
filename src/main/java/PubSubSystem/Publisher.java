package PubSubSystem;

public interface Publisher {
  public void publishMessage(Message message);
  public void addSubscriber(Subscriber subscriber);
  public void removeSubscriber(Subscriber subscriber);
}
