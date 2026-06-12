package LLDQuestion.VendingMachine;

import java.util.HashMap;

public class ProductPriceMap {
  private HashMap<Integer, Integer> productPrice;

  public ProductPriceMap(HashMap<Integer,Integer> productPrice) {
    this.productPrice = productPrice;
  }

  public int getPrice(int productId){
    return this.productPrice.get(productId);
  }

  public HashMap<Integer,Integer> getProductPrice() {
    return productPrice;
  }

  public void setProductPrice(HashMap<Integer,Integer> productPrice) {
    this.productPrice = productPrice;
  }
}
