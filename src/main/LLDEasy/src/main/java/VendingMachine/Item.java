package VendingMachine;

import java.math.BigInteger;
import java.util.Objects;

public class Item {
  private String name;
  private BigInteger amount;

  public Item(String name, BigInteger amount) {
    this.name = name;
    this.amount = amount;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public BigInteger getAmount() {
    return amount;
  }

  public void setAmount(BigInteger amount) {
    this.amount = amount;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (!(o instanceof Item item))
      return false;
    return Objects.equals(name, item.name) && Objects.equals(amount, item.amount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, amount);
  }
}
