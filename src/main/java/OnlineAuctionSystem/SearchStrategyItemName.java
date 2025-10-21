package OnlineAuctionSystem;

import java.util.ArrayList;
import java.util.List;

public class SearchStrategyItemName implements SearchStrategy<String>{
  private AuctionListingRepoImpl auctionListingRepo;
  public SearchStrategyItemName(AuctionListingRepoImpl auctionListingRepo){
    this.auctionListingRepo = auctionListingRepo;
  }
  @Override
  public List<AuctionListing> search(String criteria) {
    List<AuctionListing> liveAuctionList = this.auctionListingRepo.getAllLiveAuctionListing();
    List<AuctionListing> ansList = new ArrayList<>();
    for (AuctionListing x: liveAuctionList){
      if(x.getItemName().equals(criteria)){
        ansList.add(x);
      }
    }
    return ansList;
  }
}
