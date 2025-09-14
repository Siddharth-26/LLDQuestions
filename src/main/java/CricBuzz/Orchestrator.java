package CricBuzz;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public class Orchestrator {
  private MatchController matchController;
  private SearchController searchController;
  public Orchestrator(MatchController matchController, SearchController searchController) {
    this.searchController = searchController;
    this.matchController = matchController;
  }
  public Optional<List<Matches>> getPastMatches(){
   return this.searchController.getPastMatches(new Date());
  }
  public Optional<List<Matches>> getNextmatches(){
    return this.searchController.getNextMatches(new Date());
  }
  public void incrementScore(String matchId){
    this.matchController.incrementRun(matchId);
  }
  public void incrementWicket(String matchId){
    this.matchController.incrementWicket(matchId);
  }
  public void switchTeams(String matchId){
    this.matchController.switchTeams(matchId);
  }
}
