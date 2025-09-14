package CricBuzz;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface SearchStrategy {
  public Object search(String id);
  public Optional<List<Matches>> getPreviousMatches(Date date);
  public Optional<List<Matches>> getAfterMatches(Date date);
}
