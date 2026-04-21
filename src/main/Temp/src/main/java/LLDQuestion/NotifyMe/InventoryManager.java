package LLDQuestion.NotifyMe;

public class InventoryManager {
  private ProductInventoryRepo productInventoryRepo;

  public InventoryManager(ProductInventoryRepo productInventoryRepo) {
    this.productInventoryRepo = productInventoryRepo;
  }
  // Here
  public boolean addInventory(int productId, int amount) {
    int currentAmount = this.productInventoryRepo.getInventory(productId);
    boolean shouldNotifyUsers = false;
    if (currentAmount == 0) {
      shouldNotifyUsers = true;
    }
    // This design assumes that not multiple admins are adding the inventory at the same time.. But in case there is a possbility we need to handle race
    // conditions by synchronised or atomic integer or concurrent hashmap.
    this.productInventoryRepo.addInventory(amount, productId);
    return shouldNotifyUsers;
  }
}
