package MultiThreading;

public class SharedResource {
  public synchronized void method1(){
    System.out.println("Method 1 invoked by "+ Thread.currentThread().getName());
    try {
      Thread.sleep(6000);
    }
    catch (Exception e){
      //
    }
  }
  public synchronized void method2(){
    System.out.println("Method 2 invoked by" + Thread.currentThread().getName());
  }
}
