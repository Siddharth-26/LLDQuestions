package RobinHood;

public class StockImpl implements Stock{
  private int price;
  private String stockName;
  private String companyName;

  public StockImpl(String companyName, String stockName, int price) {
    this.companyName = companyName;
    this.stockName = stockName;
    this.price = price;
  }

  @Override
  public void setPrice(int price) {
    this.price = price;
  }

  @Override
  public int getPrice() {
    return this.price;
  }

  @Override
  public String getName() {
    return this.stockName;
  }

}
