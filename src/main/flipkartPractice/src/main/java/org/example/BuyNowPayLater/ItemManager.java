package org.example.BuyNowPayLater;

import java.util.ArrayList;
import java.util.List;

public class ItemManager {
  ItemRepo itemRepo;
  ItemInventory itemInventory;
  public ItemManager(ItemRepo itemRepo, ItemInventory itemInventory){
    this.itemRepo = itemRepo;
    this.itemInventory = itemInventory;
  }
  public void seedInventory(List<String> inventoryLines){
    // seeding the inventory.. for this use the inventory
    for(String line:inventoryLines){
      String[] values = line.split(",");
      String itemName = values[0];
      int quantity = Integer.parseInt(values[1]);
      int price = Integer.parseInt(values[2]);
      Items item = new Items(price, itemName);
      this.itemRepo.addItem(item);
      this.itemInventory.addItem(itemName, quantity);
    }
  }
  public List<String> viewInventory(){
    List<Items> itemList = this.itemRepo.getItemList();
    List<String> inventory =  new ArrayList<>();
    for(Items item:itemList){
      int quantity = this.itemInventory.getItem(item.itemName);
      String currentItem = item.itemName +","+Integer.toString(item.price)+","+Integer.toString(quantity);
      inventory.add(currentItem);
    }
    return  inventory;
  }

}
