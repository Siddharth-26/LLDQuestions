package PriceCalculator;

import java.util.List;
// currency can be as an ENUM as well to make it more restricted and catch errors @ Compile time.
public interface Calculator {
  public double calculate(List<Item> itemList );
}
