package OnlineAuctionSystem;

import java.util.HashMap;
import java.util.List;

public class SearchStrategyManager {
  private HashMap<String, SearchStrategy> searchStrategyHashMap;
  public SearchStrategyManager(HashMap<String, SearchStrategy> searchStrategyHashMap){
    this.searchStrategyHashMap = searchStrategyHashMap;
  }
  public List<AuctionListing> searchByName(String criteria){
    return this.searchStrategyHashMap.get("item-name").search(criteria);
  }
  public List<AuctionListing> searchByPriceRange(PriceRange priceRange){
    return this.searchStrategyHashMap.get("price-range").search(priceRange);
  }
}
