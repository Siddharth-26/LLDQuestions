package BookMyShow;

import java.util.List;

public interface FilterStrategy {
  public List<Shows> filterShows(Object criteria);
}
