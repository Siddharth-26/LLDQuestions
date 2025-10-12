package OnlineAuctionSystem;

import java.util.List;

public interface SearchStrategy<T> {
  public List<AuctionListing> search(T criteria);
}
