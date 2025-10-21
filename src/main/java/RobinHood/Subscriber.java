package RobinHood;

public interface Subscriber {
    public void informPartialOrder(Stock stock, int price, int amount);
    public void informCompleteOrder(Stock stock, int price, int amount);
    public void informOrderFailure(Order order);
}
