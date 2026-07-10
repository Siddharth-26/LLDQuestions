package org.example.BNPL;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ItemRepo {
  HashMap<String, Items> itemMap = new HashMap<String, Items>();
  public boolean addItem(Items item) {
    if(this.itemMap.containsKey(item.getItemName())) {
      return false;
    }
    this.itemMap.put(item.getItemName(), item);
    return true;
  }
  public List<Items> getItemList(){
    List<Items> itemList = new ArrayList<>();
    for(Items item : this.itemMap.values()){
      itemList.add(item);
    }
    return itemList;
  }
}
