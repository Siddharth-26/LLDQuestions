package OnlineAuctionSystem;

import java.time.Duration;
import java.time.Instant;
import java.util.List;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class CustomThread implements Runnable{
  private AuctionListingRepo auctionListingRepo;
  private ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
  public CustomThread(AuctionListingRepo auctionListingRepo, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor){
    this.auctionListingRepo = auctionListingRepo;
    this.scheduledThreadPoolExecutor = scheduledThreadPoolExecutor;
  }
  @Override
  public void run() {
    List<AuctionListing> auctionListingList = this.auctionListingRepo.getListingToExpire();
    for(AuctionListing x: auctionListingList){
      x.declareWinner();
    }
    AuctionListing auctionListing = this.auctionListingRepo.getNextAuctionListing();
    long diff = Duration.between(auctionListing.getExpirationTime(), Instant.now()).getSeconds();
    this.scheduledThreadPoolExecutor.schedule(this, diff, TimeUnit.SECONDS);
  }
}
