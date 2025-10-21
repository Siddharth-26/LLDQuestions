package OnlineShoppingSystem;

import java.util.List;

public interface SearchService{
  public List<Product> searchByCategory(ProductCategory category);
  public List<Product> searchById(String id);
}
