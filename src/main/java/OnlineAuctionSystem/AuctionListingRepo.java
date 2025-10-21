package OnlineAuctionSystem;

import java.time.Instant;
import java.util.List;

public interface AuctionListingRepo {
  public void addAuctionListing(AuctionListing auctionListing);
  public void removeAuctionListing(AuctionListing auctionListing);
  public AuctionListing getNextAuctionListing();
  public List<AuctionListing> getAllLiveAuctionListing();
  public List<AuctionListing> getAllListing();
  public AuctionListing createAuctionListing(String itemName, String description, Instant expirationTime, int minBidAmount);
  public AuctionListing getAuctionByID(String Id);
  public List<AuctionListing> getListingToExpire();
}
