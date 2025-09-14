package CricBuzz;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public class MatchSearchStrategy implements SearchStrategy {
  private final MatchRepo matchRepo;

  public MatchSearchStrategy(MatchRepo matchRepo){
    this.matchRepo = matchRepo;
  }
  @Override
  public Matches search(String id) {
    return this.matchRepo.getMatch(id);
  }
  public Optional<List<Matches>> getPreviousMatches(Date date){
    return Optional.of(this.matchRepo.getPastMatches(date));
  }
  public Optional<List<Matches>> getAfterMatches(Date date){
    return Optional.of(this.matchRepo.getAfterMatches(date));
  }
}
