package OnlineAuctionSystem;

import java.util.UUID;

public class User implements Subscriber{
  private String userName;
  private String phoneNumber;
  private String userEmail;
  private String userId;
  private NotificationService notificationService;
  private String password;
  public User(String userName, String userEmail, String phoneNumber, NotificationService notificationService){
    this.userEmail = userEmail;
    this.userName = userName;
    this.phoneNumber = phoneNumber;
    this.userId = UUID.randomUUID().toString();
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public String getUserEmail() {
    return userEmail;
  }

  public void setUserEmail(String userEmail) {
    this.userEmail = userEmail;
  }

  @Override
  public void notifySubscribers(String message) {
    this.notificationService.sendNotifications(message, this);
  }

  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }
}
