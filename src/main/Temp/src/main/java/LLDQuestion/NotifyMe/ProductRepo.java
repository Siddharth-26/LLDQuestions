package LLDQuestion.NotifyMe;

import java.util.HashMap;

public class ProductRepo {
  private HashMap<Integer, Product> productHashMap;
  public ProductRepo(HashMap<Integer, Product> productHashMap){
    this.productHashMap = productHashMap;
  }
  public Product getProduct(int productId){
    return this.productHashMap.get(productId);
  }
}
