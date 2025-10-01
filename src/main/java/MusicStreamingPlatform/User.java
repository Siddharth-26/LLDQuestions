package MusicStreamingPlatform;

public class User {
  private String userName;
  private String userEmail;
  private String phoneNumber;
  private String userPassword;
  private String userId;
  public User(String userName, String userEmail, String phoneNumber, String userPassword, String userId){
    this.userName = userName;
    this.userEmail = userEmail;
    this.userPassword = userPassword;
    this.phoneNumber = phoneNumber;
    this.userId = userId;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public String getUserEmail() {
    return userEmail;
  }

  public void setUserEmail(String userEmail) {
    this.userEmail = userEmail;
  }

  public String getUserPassword() {
    return userPassword;
  }

  public void setUserPassword(String userPassword) {
    this.userPassword = userPassword;
  }

  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }
}
