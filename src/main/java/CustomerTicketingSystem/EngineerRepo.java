package CustomerTicketingSystem;

import java.util.List;

public interface EngineerRepo {
  public void addEngineer(Engineer engineer);
  public void removeEngineer(String id);
  public List<Engineer> getEngineerTicketType(TicketType type);
}
