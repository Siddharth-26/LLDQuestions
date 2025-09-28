package HotelManagementService;

public interface PaymentStrategy {
  public boolean makePayment(int amount);
}
