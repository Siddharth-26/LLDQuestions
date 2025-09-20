package TicketManagementSystem;

import java.util.List;

public class User implements Subscribe {
  private String userId;
  private String userName;
  private List<Task> taskList;

  public User(String userId, String userName) {
    this.userId = userId;
    this.userName = userName;
  }

  @Override
  public void notifyUser(String message) {
    System.out.println("Received this message" + message);
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }
  public List<Task> getTaskList(){
    return this.taskList;
  }
}
