package TicketManagementSystem;

import java.util.List;

public class SearchStrategyPriority implements SearchStrategy<Priority>{
  private TaskRepository taskRepository;
  public SearchStrategyPriority(TaskRepositoryImpl taskRepository){
    this.taskRepository = taskRepository;
  }

  @Override
  public List<Task> search(Priority criteria) {
    return this.taskRepository.getPriorityTask(criteria);
  }
}
