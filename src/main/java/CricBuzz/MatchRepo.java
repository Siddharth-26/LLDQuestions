package CricBuzz;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class MatchRepo {
  private final HashMap<String,Matches> matchesHashmap;

  public MatchRepo(HashMap<String, Matches> matchesHashmap){
    this.matchesHashmap = matchesHashmap;
  }
  public Matches getMatch(String matchId){
    return this.matchesHashmap.get(matchId);
  }
  public List<Matches> getPastMatches(Date date){
    List<Matches> pastmatches = new ArrayList<>();
    for(Matches match:this.matchesHashmap.values()){
      if(match.getMatchDate().before(date)){
        pastmatches.add(match);
      }
    }
    return pastmatches;
  }
  public List<Matches> getAfterMatches(Date date){
    List<Matches> after = new ArrayList<>();
    for(Matches match:this.matchesHashmap.values()){
      if(match.getMatchDate().after(date)){
        after.add(match);
      }
    }
    return after;
  }
}
