package PriceCalculator;

import java.util.ArrayList;
import java.util.List;

// This can be assumed as the Client code.
public class Main {
  public static void main(String[] args) {
    List<Item> itemList = new ArrayList<>();
//    itemList.add(new Item("Laptop", 100055.98, 1));
//    itemList.add(new Item("Headphones", 5007.7, 2));
//    itemList.add(new Item("Bottle", 4004.5, 3));
    itemList.add(new Item("Shirt", 63.5, 30));
    Calculator basicCalculator = new BaseCalculator();
    Calculator PercentageDiscount = new PercentageDiscountModifier(basicCalculator, "AUGUST_MADNESS");
    Calculator PercentageTaxDiscount = new PercentageTaxPriceModifier(PercentageDiscount, 15);
    Calculator CurrencyPriceModifier = new CurrencyPriceModifier(PercentageTaxDiscount, "INR");
    Calculator FloorPriceModifier = new FloorPriceModifier(CurrencyPriceModifier);
    System.out.println("This is your bill" + FloorPriceModifier.calculate(itemList));
  }
}
