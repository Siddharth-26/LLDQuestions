package CricBuzz;

public class MatchControllerImpl implements MatchController{

  private final MatchRepo matchRepo;

  public MatchControllerImpl(MatchRepo matchRepo){
    this.matchRepo = matchRepo;
  }

  @Override
  public void incrementRun(String matchId) {
    Matches match = this.matchRepo.getMatch(matchId);
    match.incrementScore();
    match.notifySubscribers();
  }

  @Override
  public void incrementWicket(String matchId) {
    Matches match = this.matchRepo.getMatch(matchId);
    match.incrementWicket();
    match.notifySubscribers();
  }

  @Override
  public void switchTeams(String matchId) {
    Matches match = this.matchRepo.getMatch(matchId);
    match.switchTeams();
    match.notifySubscribers();
  }
}
