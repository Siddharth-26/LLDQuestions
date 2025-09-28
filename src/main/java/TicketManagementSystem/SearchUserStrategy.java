package TicketManagementSystem;

import java.util.List;

public class SearchUserStrategy implements SearchStrategy<String>{
  UserRepository userRepository;
  public SearchUserStrategy(UserRepository userRepository){
    this.userRepository = userRepository;
  }
  @Override
  public  List<Task> search(String criteria) {
    User user = this.userRepository.getUser(criteria);
    return user.getTaskList();
  }
}
