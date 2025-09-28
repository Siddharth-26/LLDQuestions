package TicketManagementSystem;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class AssignmentManager {
  ConcurrentHashMap<String, User> userRepository;
  ConcurrentHashMap<String, Task> taskRepository;
  ReadWriteLock lock = new ReentrantReadWriteLock();
  public AssignmentManager(ConcurrentHashMap<String, User> userRepository, ConcurrentHashMap<String, Task> taskRepository){
    this.userRepository = userRepository;
    this.taskRepository = taskRepository;
  }
  public void assignUser(String userId, String taskId){
    User user = this.userRepository.get(userId);
    try{
      lock.writeLock().lock();
    Task task = this.taskRepository.get(taskId);
    task.setUser(user);
    }
    catch (Exception e) {
      System.out.println(e);
    }
    finally {
      lock.writeLock().unlock();

    }
  }
}
