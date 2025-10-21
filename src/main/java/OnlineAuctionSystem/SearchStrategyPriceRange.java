package OnlineAuctionSystem;

import java.util.List;

public class SearchStrategyPriceRange implements SearchStrategy<PriceRange>{
  private AuctionListingRepoImpl auctionListingRepo;
  public SearchStrategyPriceRange(AuctionListingRepoImpl auctionListingRepo){
    this.auctionListingRepo = auctionListingRepo;
  }
  @Override
  public List<AuctionListing> search(PriceRange criteria) {
    return this.auctionListingRepo.getAllLiveAuctionListing().stream().filter((key)->{
      if(key.getMinBidAmount()>=criteria.getMinPrice() && key.getMinBidAmount()<=criteria.getMaxPrice()){
        return true;
      }
      return false;
    }).toList();
  }
}
