package LLDQuestion.PizzaBillingSystem;

import java.math.BigDecimal;

public class OrderManager {
  private ToppingPriceRepo toppingPriceRepo;
  private OrderRepo orderRepo;
  private PizzaPriceRepo pizzaPriceRepo;
  private Order currOrder;
  private Pizza currPizza;

  public OrderManager(ToppingPriceRepo toppingPriceRepo, OrderRepo orderRepo, PizzaPriceRepo pizzaPriceRepo) {
    this.toppingPriceRepo = toppingPriceRepo;
    this.orderRepo = orderRepo;
    this.pizzaPriceRepo = pizzaPriceRepo;
  }
  public Order createOrder(){
    Order order =  new Order();
    this.orderRepo.addorder(order);
    return order;
  }
  public boolean addPizza(PizzaType type){
    this.currPizza = new Pizza(type, this.pizzaPriceRepo.getPrice(type));
  this.currOrder.addPizza(this.currPizza);
  return true;
  }
  public boolean addTopping(ToppingType type){
    Topping topping = new ToppingImpl(type, this.toppingPriceRepo.getToppingPrice(type));
    this.currPizza.addTopping(topping);
    return true;
  }
  public BigDecimal calculateTotal(){
    return this.currOrder.calculateTotal();
  }
}
