package OnlineShoppingSystem;

import java.util.List;

public interface SearchStrategy<T> {
  public List<Product> search(T criteria);
}
