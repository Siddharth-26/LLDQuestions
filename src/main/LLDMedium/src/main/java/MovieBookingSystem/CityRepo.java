package MovieBookingSystem;

import java.util.HashMap;

public class CityRepo {
  private HashMap<String, City> cityMap = new HashMap<>();

  public HashMap<String,City> getCityMap() {
    return cityMap;
  }

  public void setCityMap(HashMap<String,City> cityMap) {
    this.cityMap = cityMap;
  }
  public void addCity(City city){
    this.cityMap.put(city.getName(), city);
  }
  public City getCity(String name){
    return this.cityMap.get(name);
  }
}
