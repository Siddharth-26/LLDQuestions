package TicketManagementSystem;

import java.util.Date;
import java.util.List;
import java.util.UUID;

public class TaskImpl implements Task, Publisher{

  private String title;
  private String description;
  private Date dueDate;
  private Priority priority;
  private String id;
  private List<Subscribe> subscribersList;
  private User assignedUser;

  private TaskImpl(Builder b){
    this.title = b.title;
    this.dueDate = b.dueDate;
    this.description = b.description;
    this.priority = b.priority;
    this.id = b.id;
  }

  @Override
  public void addSubscriber(Subscribe subscribe) {
    this.subscribersList.add(subscribe);
  }

  @Override
  public void removeSubscriber(Subscribe subscribe) {
    this.subscribersList.remove(subscribe);
  }

  @Override
  public void notifySubscribers(String message) {
  for (Subscribe x: subscribersList){
    x.notifyUser(message);
  }
  }

  public class Builder{
    private String title;
    private String description;
    private Date dueDate;
    private Priority priority;
    private String id = UUID.randomUUID().toString();
    public Builder title(String title){
      this.title = title;
      return this;
    }
    public Builder description(String description){
      this.description = description;
      return this;
    }
    public Builder dueDate(Date dueDate){
      this.dueDate = dueDate;
      return this;
    }
    public Builder priority(Priority priority) {
      this.priority = priority;
      return this;
    }
    public Task build(){
      return new TaskImpl(this);
    }
  }

  public String getTitle() {
    return title;
  }

  public String getDescription() {
    return description;
  }

  public Date getDueDate() {
    return dueDate;
  }

  public Priority getPriority() {
    return priority;
  }

  @Override
  public synchronized void setUser(User user) {
    User previousUser = this.assignedUser;
    this.assignedUser = user;
    this.subscribersList.remove(previousUser);
    this.subscribersList.add(user);
  }

  @Override
  public void setTitle(String title) {
    this.title = title;
  }

  @Override
  public void setDescription(String description) {
this.description = description;
  }

  @Override
  public void setDueDate(Date dueDate) {
this.dueDate = dueDate;
  }

  @Override
  public void setPriority(Priority priority) {
    this.priority = priority;
  }

  @Override
  public String getId() {
    return this.id;
  }

}
