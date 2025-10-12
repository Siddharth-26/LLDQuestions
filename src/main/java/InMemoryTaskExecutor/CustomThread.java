package InMemoryTaskExecutor;

import java.util.Timer;

public class CustomThread extends Thread{
  private Runnable object;
  private long timetoexecute;
  private Timer timer;
  @Override
  public void run(){
    //
  }
  public void setObject(Runnable object){
    this.object = object;
  }
  public void setTime(long time){
    this.timetoexecute = time;
  }
}
