package BookMyShow;

import java.util.List;

public interface ShowRepo {
  public void addShow(Shows shows);
  public List<Shows> getShowsForMovies(String movieName);
}
