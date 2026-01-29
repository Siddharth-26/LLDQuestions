package BookMyShow;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public class ShowRepoImpl implements ShowRepo{
  ConcurrentHashMap<String, Shows> showListings;
  public ShowRepoImpl(){
    this.showListings = new ConcurrentHashMap<>();
  }
  @Override
  public void addShow(Shows shows) {
    this.showListings.put(shows.getMovieName(), shows);
  }

  @Override
  public List<Shows> getShowsForMovies(String movieName) {
    return this.showListings.values().stream().filter((obj)->{
      if(obj.getMovieName()==movieName){
        return true;
      }
      return false;
    }).toList();
  }
  public List<Shows> getShows(){
    return this.showListings.values().stream().toList();
  }
}
