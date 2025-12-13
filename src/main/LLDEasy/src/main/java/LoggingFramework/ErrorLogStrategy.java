package LoggingFramework;

import java.util.ArrayList;
import java.util.List;

public class ErrorLogStrategy implements LogStrategies{
  private List<Writers> writerList;
  public ErrorLogStrategy(){
    this.writerList = new ArrayList<>();
  }
  @Override
  public void log(String message) {
   for (Writers writers: this.writerList){
     writers.writeMessage(message);
   }
  }
  public void addWriter(Writers writer){
    this.writerList.add(writer);
  }
  public void removeWriter(Writers writer){
    int index = 0;
    for(int i =0;i<writerList.size();i++){
      Writers writers = this.writerList.get(i);
      String name = writers.getClass().getName();
      if(name==writer.getClass().getName()){
        index = i;
        break;
      }
    }
    this.writerList.remove(index);
  }
  private String composeMessage(String message){
    return "ERROR : =====>>>>>" + message;
  }
}
