package OnlineShoppingSystem;

import java.util.List;

public class Orchestrator {
  private SearchService searchService;
  private CheckoutService checkoutService;
  private UserRepo userRepo;
  public Orchestrator(SearchService searchService, CheckoutService checkoutService, UserRepo userRepo){
    this.checkoutService = checkoutService;
    this.searchService = searchService;
    this.userRepo = userRepo;
  }
  public List<Product> search(ProductCategory productCategory){
    return this.searchService.searchByCategory(productCategory);
  }
  public List<Product> search(String id){
    return this.searchService.searchById(id);
  }
  public void createUser(String userName, String phoneNumber){
    User user = new User(userName, phoneNumber);
    this.userRepo.adduser(user);
  }
  public void removeUser(User user){
    this.userRepo.deleteUser(user);
  }
  public void addItem(User user, String id, int count){
    user.addItemstoCart(id, count);
  }
  public void removeItem(User user, String id, int count){
    user.removeItemfromCart(id, count);
  }
  public void checkout(User user, PaymentModes mode){
    this.checkoutService.checkout(user, mode);
  }
}
