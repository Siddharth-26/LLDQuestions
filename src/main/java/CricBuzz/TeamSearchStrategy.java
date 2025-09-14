package CricBuzz;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public class TeamSearchStrategy implements SearchStrategy{
  private TeamsRepo teamRepo;
  public TeamSearchStrategy(TeamsRepo teamsRepo){
    this.teamRepo = teamsRepo;
  }
  @Override
  public Team search(String teamid) {
    return this.teamRepo.getTeam(teamid);
  }

  @Override
  public Optional<List<Matches>> getPreviousMatches(Date date) {
    return Optional.empty();
  }

  @Override
  public Optional<List<Matches>> getAfterMatches(Date date) {
    return Optional.empty();
  }
}
