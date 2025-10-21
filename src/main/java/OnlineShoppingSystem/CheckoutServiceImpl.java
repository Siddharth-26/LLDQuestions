package OnlineShoppingSystem;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class CheckoutServiceImpl implements CheckoutService {
  private PaymentService paymentService;
  private BillingService billingService;
  private InventoryRepo inventoryRepo;
  public CheckoutServiceImpl(PaymentService paymentService, BillingService billingService, InventoryRepo inventoryRepo){
    this.paymentService = paymentService;
    this.billingService = billingService;
    this.inventoryRepo = inventoryRepo;
  }
  @Override
  public boolean checkout(User user, PaymentModes mode) {
    List<String> outOfStockList = new ArrayList<>();
    ShoppingCart shoppingCart = user.getShoppingCart();
    BigDecimal amount = this.billingService.calculateBill(shoppingCart);
    List<String> checkedOut = new ArrayList<>();
    try{
      this.paymentService.makePayment(mode, amount);
    List<String> idList = shoppingCart.getProductId();
    for(String id:idList){
      if(this.inventoryRepo.removeProduct(id, shoppingCart.getItemQuantity(id))){
        checkedOut.add(id);
      }
      else{
        outOfStockList.add(id);
      }
    }
    if(outOfStockList.size()>0){
      System.out.println("These items are Out od Stock Initiate refund for these Items");
    }
      System.out.println("Printing the list Of items that are checkout out succesfully.");
    Order order = new Order(user.getUserId(), checkedOut);
    user.addOrder(order);
    return true;
  }
    catch (Exception e){
      System.out.println("Payment could not be made due to some exception");
      return false;
    }
  }
}
