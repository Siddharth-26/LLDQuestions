package PriceCalculator;

public class Item {
  String name;
  double unitPrice;
  int quantity;

  public Item(String name, double unitPrice, int quantity){
    this.name = name;
    this.unitPrice = unitPrice;
    this.quantity = quantity;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getUnitPrice() {
    return unitPrice;
  }

  public void setUnitPrice(int unitPrice) {
    this.unitPrice = unitPrice;
  }

  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }
}
