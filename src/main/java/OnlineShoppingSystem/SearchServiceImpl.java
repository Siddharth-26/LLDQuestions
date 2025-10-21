package OnlineShoppingSystem;

import java.util.List;


public class SearchServiceImpl implements SearchService{
  private SearchStrategy<ProductCategory> byCategory;
  private SearchStrategy<String> byId;
  public SearchServiceImpl(SearchStrategy<ProductCategory> byCategory, SearchStrategy<String> byId){
    this.byCategory = byCategory;
    this.byId = byId;
  }
  @Override
  public List<Product> searchByCategory(ProductCategory category) {
    return this.byCategory.search(category);
  }

  @Override
  public List<Product> searchById(String id) {
    return this.byId.search(id);
  }
}
