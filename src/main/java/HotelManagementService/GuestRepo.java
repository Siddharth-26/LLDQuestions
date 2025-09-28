package HotelManagementService;

import java.util.HashMap;

public class GuestRepo {
  HashMap<String, Guest> guestRepo;
  public GuestRepo(HashMap<String, Guest> guestRepo){
    this.guestRepo = guestRepo;
  }
  public Guest getGuest(String guestId){
    return this.guestRepo.get(guestId);
  }
}
