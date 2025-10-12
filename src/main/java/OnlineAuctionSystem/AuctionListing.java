package OnlineAuctionSystem;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class AuctionListing implements Publisher, Comparable<AuctionListing> {
  private String itemName;
  private String description;
  private int minBidAmount;
  private Instant expirationTime;
  private List<Subscriber> subscriberList;
  private User highestBidUser;
  private String listingId;

  public AuctionListing(String itemName, String description, int minBidAmount, Instant expirationTime) {
    this.itemName = itemName;
    this.description = description;
    this.minBidAmount = minBidAmount;
    this.expirationTime = expirationTime;
    this.listingId = UUID.randomUUID().toString();
    this.subscriberList = new ArrayList<>();
  }
  public synchronized boolean makeBid(int bidAmount, User user){
    if(bidAmount>this.minBidAmount){
      this.highestBidUser = user;
      this.subscriberList.add(user);
      this.minBidAmount = bidAmount;
      String message = "There is a new User with the highest Bid" + this.highestBidUser.getUserName()+" who placed the bid with amount" + this.minBidAmount;
      this.sendNotifications(message);
      return true;
    }
    else{
      return false;
    }
  }
  public void declareWinner(){
    String message = "We have a winner" + this.highestBidUser.getUserName()+ "lets give them a round of applause.";
    this.sendNotifications(message);
  }
  @Override
  public void sendNotifications(String message) {
    for (Subscriber x: this.subscriberList){
      x.notifySubscribers(message);
    }
  }

  @Override
  public synchronized void  addSubscriber(Subscriber subscriber) {
    this.subscriberList.add(subscriber);
  }

  @Override
  public synchronized void removeSubscriber(Subscriber subscriber) {
    this.subscriberList.remove(subscriber);
  }

  public String getListingId() {
    return listingId;
  }

  public void setListingId(String listingId) {
    this.listingId = listingId;
  }


  @Override
  public int compareTo(AuctionListing o) {
    return this.expirationTime.compareTo(o.expirationTime);
  }

  public Instant getExpirationTime() {
    return expirationTime;
  }

  public void setExpirationTime(Instant expirationTime) {
    this.expirationTime = expirationTime;
  }

  public String getItemName() {
    return itemName;
  }

  public void setItemName(String itemName) {
    this.itemName = itemName;
  }

  public int getMinBidAmount() {
    return minBidAmount;
  }

  public void setMinBidAmount(int minBidAmount) {
    this.minBidAmount = minBidAmount;
  }

}
