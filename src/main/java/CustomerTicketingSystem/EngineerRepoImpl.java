package CustomerTicketingSystem;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class EngineerRepoImpl implements EngineerRepo{
  private ConcurrentHashMap<TicketType,List<Engineer>> engineerMap;
  public EngineerRepoImpl(ConcurrentHashMap<TicketType, List<Engineer>> engineerMap){
    this.engineerMap = engineerMap;
  }

  @Override
  public void addEngineer(Engineer engineer) {
    List<TicketType> ticketTypes = engineer.getEngineerType();
    for(TicketType type: ticketTypes){
      this.engineerMap.computeIfAbsent(type, k->{
        return new CopyOnWriteArrayList<>();
      }).add(engineer);
    }
  }

  @Override
  public void removeEngineer(String id) {
//    List<TicketType> keySet = this.engineerMap.;

  }

  @Override
  public List<Engineer> getEngineerTicketType(TicketType type) {
    return this.engineerMap.get(type);
  }
}
