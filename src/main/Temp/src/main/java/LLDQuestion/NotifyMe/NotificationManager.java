package LLDQuestion.NotifyMe;

public class NotificationManager {
  ProductRepo productRepo;
  // Here the registration is possible if the productId exists and the users exists so all those checks are needed but skipping for now..
  public boolean register(int productId, User user){
    Product product = this.productRepo.getProduct(productId);
    product.addSubscriber(user);
    return true;
  }
  public void notifyUsers(int productId){
    Product product = this.productRepo.getProduct(productId);
    String message = "This product is back in stock" + productId;
    product.sendNotification(message);
  }
}
