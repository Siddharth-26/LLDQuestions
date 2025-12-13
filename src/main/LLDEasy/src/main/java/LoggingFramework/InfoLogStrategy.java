package LoggingFramework;

import java.util.ArrayList;
import java.util.List;

public class InfoLogStrategy implements LogStrategies{
  private List<Writers> writersList;
  public InfoLogStrategy(){
    this.writersList = new ArrayList<>();
  }
  @Override
  public void log(String message) {
    for(Writers writers: this.writersList){
      writers.writeMessage(message);
    }
  }

  @Override
  public void addWriter(Writers writer) {
    this.writersList.add(writer);
  }

  @Override
  public void removeWriter(Writers writer) {
    int index = 0;
    for(int i =0;i<this.writersList.size();i++){
      Writers writers = this.writersList.get(i);
      String name = writers.getClass().getName();
      if(name.equals(writer.getClass().getName())){
        index = i;
        break;
      }
    }
    this.writersList.remove(index);
  }

  public String composedMessage(String message){
    return "INFO : =====>>>>>" + message;
  }

}
