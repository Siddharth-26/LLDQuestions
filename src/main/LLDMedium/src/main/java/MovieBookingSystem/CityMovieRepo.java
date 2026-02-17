package MovieBookingSystem;

import java.util.HashMap;
import java.util.List;

public class CityMovieRepo {
  private HashMap<City,List<Movie>> cityMovieRepo;

  public CityMovieRepo(HashMap<City,List<Movie>> cityMovieRepo) {
    this.cityMovieRepo = cityMovieRepo;
  }
  public void addMovie(City city, Movie movie){
    List<Movie> lst = this.cityMovieRepo.get(city);
    lst.add(movie);
    lst.stream().distinct().toList();
  }
  public List<Movie> getMovies(City city){
    return this.cityMovieRepo.get(city);
  }
}
