package CricBuzz;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

public class SearchController {
  HashMap<SearchTypes, SearchStrategy> map;
  public SearchController(HashMap<SearchTypes, SearchStrategy> map){
    this.map =map;
  }
  public Object getSearchStrategy(SearchTypes searchTypes, String id){
    return this.map.get(searchTypes).search(id);
  }
  public Optional<List<Matches>> getPastMatches(Date date){
    return this.map.get(SearchTypes.MATCH).getPreviousMatches(date);
  }
  public Optional<List<Matches>> getNextMatches(Date date){
    return this.map.get(SearchTypes.MATCH).getAfterMatches(date);
  }
}
