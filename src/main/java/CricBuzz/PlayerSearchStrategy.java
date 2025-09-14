package CricBuzz;

import java.util.Date;
import java.util.List;
import java.util.Optional;


public class PlayerSearchStrategy implements SearchStrategy{
  private PlayerRepo playerRepo;
  public PlayerSearchStrategy(PlayerRepo playerRepo){
    this.playerRepo = playerRepo;
  }
  @Override
  public Player search(String playerId) {
    return this.playerRepo.getPlayer(playerId);
  }

  @Override
  public Optional<List<Matches>> getPreviousMatches(Date date) {
    return Optional.of(List.of());
  }

  @Override
  public Optional<List<Matches>> getAfterMatches(Date date) {
    return Optional.of(List.of());
  }
}
