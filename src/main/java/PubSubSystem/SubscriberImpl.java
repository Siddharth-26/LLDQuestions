package PubSubSystem;

public class SubscriberImpl implements Subscriber{

  @Override
  public void notifySubscriber(Message message) {
    System.out.println(message.getMessage());
  }
}
