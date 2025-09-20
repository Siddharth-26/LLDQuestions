package TicketManagementSystem;

import java.util.Date;

public interface Task {
  public void setTitle(String title);
  public void setDescription(String description);
  public void setDueDate(Date dueDate);
  public void setPriority(Priority priority);
  public String getId();
  public Priority getPriority();
  public void setUser(User user);
}
