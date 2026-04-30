package MovieBookingSystem;

import java.util.ArrayList;
import java.util.List;

public class Theatre {
  private String name;
  private String address;
  private City city;
  private List<Show> shows;
  public Theatre(String name, String address, City city){
    this.name = name;
    this.address = address;
    this.city = city;
    this.shows = new ArrayList<>();
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public City getCity() {
    return city;
  }

  public void setCity(City city) {
    this.city = city;
  }

  public List<Show> getShows() {
    return shows;
  }

  public void setShows(List<Show> shows) {
    this.shows = shows;
  }
  public void addShow(Show show){
    this.shows.add(show);
  }
  public List<Movie> getALlMovies(){
    List<Movie> lst = new ArrayList<>();
    for(Show x: shows){
      lst.add(x.getMovie());
    }
  return lst;
  }
  public Show getShow(int index){
    return this.shows.get(index);
  }
}
