package MovieBookingSystem;

import java.util.List;

public class Orchestrator {
  private CityRepo cityRepo;
  private CityMovieRepo cityMovieRepo;
  private MovieTheatreRepo movieTheatreRepo;
  private ShowManager showManager;

  public Orchestrator(
      CityRepo cityRepo,
      CityMovieRepo cityMovieRepo,
      MovieTheatreRepo movieTheatreRepo,
      ShowManager showManager) {
    this.cityRepo = cityRepo;
    this.cityMovieRepo = cityMovieRepo;
    this.movieTheatreRepo = movieTheatreRepo;
    this.showManager = showManager;
  }

  public City searchCity(String cityName){
    return this.cityRepo.getCity(cityName);
  }
  public List<Movie> getMoviesForCity(City city){
    return this.cityMovieRepo.getMovies(city);
  }
  public List<Theatre> getTheatreForMovie(Movie movie){
    return this.movieTheatreRepo.getMovieTheatres(movie);
  }
  public List<Show> getShows(Theatre theatre){
    return theatre.getShows();
  }
  public List<Ticket> bookMyShow(List<Seat> seatList, Show show, String name, String email){
    return showManager.bookTicket(seatList, show, name, email);
  }

}
