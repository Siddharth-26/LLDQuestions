package MultiThreading;

public class Main {
  public static void main(String[] args) {
  SharedResource sharedResource = new SharedResource();
  Thread thread1 = new Thread(()->{
    sharedResource.method1();
  });
  Thread thread2 = new Thread(()->{
    try {
      Thread.sleep(1000);
      sharedResource.method2();
    }
    catch (Exception e){
      //
    }
    });
  thread1.start();
  thread2.start();
  }
}
