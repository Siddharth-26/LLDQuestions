package LLDQuestion.NotifyMe;

public interface Publisher {
  public void sendNotification(String message);
  public void addSubscriber(Subscriber subscriber);
  public void removeSubscriber(Subscriber subscriber);
}
