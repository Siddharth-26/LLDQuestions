package org.example.BuyNowPayLater;

import java.util.concurrent.ConcurrentHashMap;

public class ItemInventory {
  ConcurrentHashMap<String, Integer> itemInventory = new ConcurrentHashMap<>();
  public ItemInventory(ConcurrentHashMap<String, Integer> itemInventory) {
    this.itemInventory = itemInventory;
  }
  public boolean updateItem(String itemName, Integer quantity){
    Integer[] items = new Integer[2];
    if(this.itemInventory.containsKey(itemName)){
      this.itemInventory.compute(itemName, (item, stock)->{
        if(stock<quantity){
          items[0] = stock;
          items[1] = stock-quantity;
          return stock-quantity;
        }
        items[0] = stock;
        items[1] = stock;
        return stock;
      });
      if(items[0]>items[1]){
        return true;
      }
    }
    return false;
  }
  public boolean addItem(String itemName, Integer quantity){{
    Integer[] items = new Integer[2];
    this.itemInventory.compute(itemName, (item, stock)->{
      items[0] = stock;
      items[1] = stock+quantity;
      return stock+quantity;
    });
    if(items[0]<items[1]){
      return true;
    }
    return false;
  }
  }
  public int getItem(String itemName){
    if(this.itemInventory.containsKey(itemName)){
      return this.itemInventory.get(itemName);
    }
    return 0;
  }
}
