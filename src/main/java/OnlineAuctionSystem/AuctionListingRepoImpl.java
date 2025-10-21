package OnlineAuctionSystem;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.PriorityBlockingQueue;

public class AuctionListingRepoImpl implements AuctionListingRepo{
  ConcurrentHashMap<String, AuctionListing> auctionListingMap;
  PriorityBlockingQueue<AuctionListing> auctionListings;
  public AuctionListingRepoImpl(){
    this.auctionListingMap = new ConcurrentHashMap<>();
  }
  @Override
  public synchronized void addAuctionListing(AuctionListing auctionListing) {
      this.auctionListingMap.put(auctionListing.getListingId(), auctionListing);
      this.auctionListings.add(auctionListing);
  }

  @Override
  public void removeAuctionListing(AuctionListing auctionListing) {
    if(this.auctionListingMap.containsKey(auctionListing.getListingId())){
      this.auctionListingMap.remove(auctionListing.getListingId());
    }
  }

  @Override
  public AuctionListing getNextAuctionListing() {
    return this.auctionListings.peek();
  }

  @Override
  public List<AuctionListing> getAllLiveAuctionListing() {
    return this.auctionListingMap.values().stream().filter((listing)->{
      if(Instant.now().compareTo(listing.getExpirationTime())>0){
        return false;
      }
      return true;
    }).toList();
  }

  @Override
  public List<AuctionListing> getAllListing() {
    return this.auctionListingMap.values().stream().toList();
  }

  @Override
  public AuctionListing createAuctionListing(
      String itemName, String description, Instant expirationTime, int minBidAmount) {
    AuctionListing auctionListing = new AuctionListing(itemName, description, minBidAmount, expirationTime);
    this.auctionListingMap.put(auctionListing.getListingId(), auctionListing);
    return auctionListing;
  }

  @Override
  public AuctionListing getAuctionByID(String Id) {
    AuctionListing auctionListing = this.auctionListingMap.get(Id);
    if(Instant.now().compareTo(auctionListing.getExpirationTime())>1){
      return auctionListing;
    }
    return null;
  }

  @Override
  public List<AuctionListing> getListingToExpire() {
    List<AuctionListing> ansList = new ArrayList<>();
    while(this.auctionListings.size()>0){
      if(this.auctionListings.peek().getExpirationTime().compareTo(Instant.now())<=0){
        AuctionListing auctionListing = this.auctionListings.poll();
        ansList.add(auctionListing);
      }
    }
    return ansList;
  }
}
