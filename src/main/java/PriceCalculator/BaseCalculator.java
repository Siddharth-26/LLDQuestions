package PriceCalculator;

import java.util.List;

public class BaseCalculator implements Calculator{

  @Override
  public double calculate(List<Item> itemList) {
    double price = 0;
    for (Item x: itemList){
      double itemUnitprice = x.unitPrice;
      int quantity = x.quantity;
      price+=(itemUnitprice*quantity);
    }
    System.out.println("Basic Calculator" + Double.toString(price));
    return price;
  }
}
