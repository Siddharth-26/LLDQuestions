package OnlineShoppingSystem;

public interface CheckoutService {
  public boolean checkout(User user, PaymentModes mode);
}
