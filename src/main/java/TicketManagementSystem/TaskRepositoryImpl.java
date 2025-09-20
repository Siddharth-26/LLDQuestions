package TicketManagementSystem;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class TaskRepositoryImpl implements TaskRepository{
  ConcurrentHashMap<String , Task> taskRepository;
  private ReadWriteLock lock = new ReentrantReadWriteLock();
  public TaskRepositoryImpl(ConcurrentHashMap<String, Task> taskRepository){
    this.taskRepository = taskRepository;
  }
  @Override
  public Task getTask(String taskId) {
    return this.taskRepository.get(taskId);
  }

  @Override
  public void setTask(Task task) {
    this.taskRepository.put(task.getId(), task);
  }

  @Override
  public List<Task> getPriorityTask(Priority priority) {
    lock.readLock().lock();
    try{
      return this.taskRepository.values().stream().filter(task -> {
        if(task.getPriority()==priority){
          return true;
        }
        return false;
      }).toList();
    }
    finally {
      lock.readLock().unlock();
    }
  }
}
