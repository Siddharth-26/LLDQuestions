package MovieBookingSystem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MovieTheatreRepo {
  private HashMap<Movie,List<Theatre>> movieTheatreMap;
  public List<Theatre> getMovieTheatres(Movie movie){
    return this.movieTheatreMap.get(movie);
  }
  public void addMovieTheater(Movie movie, Theatre theatre){
    if(this.movieTheatreMap.containsKey(movie)){
      List<Theatre> lst = this.movieTheatreMap.get(movie);
      lst.add(theatre);
      lst.stream().distinct().toList();
      this.movieTheatreMap.put(movie, lst);
    }
    else{
      List<Theatre> lst = new ArrayList<>();
      lst.add(theatre);
      this.movieTheatreMap.put(movie, lst);
    }
  }
}
