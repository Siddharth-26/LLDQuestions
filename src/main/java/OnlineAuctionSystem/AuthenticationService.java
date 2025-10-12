package OnlineAuctionSystem;

public class AuthenticationService {
  private UserRepo userRepo;
  public AuthenticationService(UserRepo userRepo){
    this.userRepo = userRepo;
  }
  public boolean authenticateUser(String userId, String password){
    User user = this.userRepo.getUserbyId(userId);
    if(user.getPassword().equals(password)){
      return true;
    }
    return false;
  }
}
