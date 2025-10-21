package OnlineShoppingSystem;

public class Product {
  private String productId;
  private String productName;
  private ProductCategory category;
  private int price;

  public Product(String productId, String productName, ProductCategory productCategory, int price) {
    this.productId = productId;
    this.productName = productName;
    this.category = productCategory;
    this.price = price;
  }

  public String getProductId() {
    return productId;
  }

  public void setProductId(String productId) {
    this.productId = productId;
  }

  public String getProductName() {
    return productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }

  public ProductCategory getCategory() {
    return category;
  }

  public void setCategory(ProductCategory category) {
    this.category = category;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }
}
