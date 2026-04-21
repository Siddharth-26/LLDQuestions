package LLDQuestion.NotifyMe;

public class Orchestrator {
  private NotificationManager notificationManager;
  private InventoryManager inventoryManager;
  public Orchestrator(NotificationManager notificationManager, InventoryManager inventoryManager){
    this.notificationManager = notificationManager;
    this.inventoryManager = inventoryManager;
  }
  public boolean register(int productId, User user){
    return this.notificationManager.register(productId, user);
  }
  public void addInventory(int productId, int amount){
    boolean shouldNotifyUsers = this.inventoryManager.addInventory(productId, amount);
    if(shouldNotifyUsers){
      this.notificationManager.notifyUsers(productId);
    }
  }
}
