package CricBuzz;

public class User  implements Subscriber{
  private String userName;
  private String userId;

  public User(String userId, String userName) {
    this.userId = userId;
    this.userName = userName;
  }

  @Override
  public void update(String message) {
    System.out.println(message);
  }
}
