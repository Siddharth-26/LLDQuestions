package TicketManagementSystem;

import java.util.List;

public interface TaskRepository {
  public Task getTask(String taskId);
  public void setTask(Task task);
  public List<Task> getPriorityTask(Priority priority);
}
