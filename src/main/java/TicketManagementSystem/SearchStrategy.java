package TicketManagementSystem;

import java.util.List;

public interface SearchStrategy<T> {
  public List<Task> search(T criteria);
}
