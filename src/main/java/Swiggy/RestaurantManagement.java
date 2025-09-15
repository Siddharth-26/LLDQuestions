package Swiggy;

public interface RestaurantManagement {
  public void addRestaurant(String restaurantName);
  public void addDish(String restaurantID, String dishName, String dishDescription, int price);
  public void updateDish(String dishID, String dishName, String dishDescription, int price);
  public void search();
}
