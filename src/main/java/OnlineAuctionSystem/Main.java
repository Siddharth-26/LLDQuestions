package OnlineAuctionSystem;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Main {
  public static void main(String[] args) {
    ScheduledThreadPoolExecutor reaperService = new ScheduledThreadPoolExecutor(1);
    AuctionListingRepo auctionListingRepo = new AuctionListingRepoImpl();
    CustomThread customThread = new CustomThread(auctionListingRepo, reaperService);
    reaperService.schedule(customThread, 0, TimeUnit.SECONDS);
  }
}
