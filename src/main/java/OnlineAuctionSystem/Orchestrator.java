package OnlineAuctionSystem;

import java.time.Instant;
import java.util.List;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Orchestrator {
  private AuthenticationService authenticationService;
  private SearchStrategyManager searchStrategyManager;
  private AuctionListingRepo auctionListingRepo;
  private ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
  private Runnable customThread;
  public Orchestrator(AuthenticationService authenticationService, SearchStrategyManager searchStrategyManager, AuctionListingRepo auctionListingRepo, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor, CustomThread customThread){
    this.searchStrategyManager = searchStrategyManager;
    this.authenticationService = authenticationService;
    this.scheduledThreadPoolExecutor = scheduledThreadPoolExecutor;
    this.auctionListingRepo = auctionListingRepo;
    this.customThread = customThread;
  }
  public List<AuctionListing> searchByName(String itemName){
    return this.searchStrategyManager.searchByName(itemName);
  }
  public List<AuctionListing> searchByPriceRange(PriceRange priceRange){
    return this.searchStrategyManager.searchByPriceRange(priceRange);
  }
  public boolean authenticate(String userId, String password){
    return this.authenticationService.authenticateUser(userId, password);
  }
  public AuctionListing createAuctionListing(String itemName, String description, Instant expirationTime, int minBidAmount){
    AuctionListing auctionListing = this.auctionListingRepo.createAuctionListing(itemName, description, expirationTime, minBidAmount);
    this.scheduledThreadPoolExecutor.schedule(customThread, 0, TimeUnit.SECONDS);
    return auctionListing;
  }
  public boolean placeBidListing(int minBidAmount, User user, String auctionId){
    AuctionListing auctionListing = this.auctionListingRepo.getAuctionByID(auctionId);
    if(auctionListing!=null){
    return auctionListing.makeBid(minBidAmount, user);
    }
    return false;
  }
}
