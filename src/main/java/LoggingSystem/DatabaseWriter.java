package LoggingSystem;

public class DatabaseWriter implements Runnable{
  private final DatabaseWriteHandler databaseHandler;

  public DatabaseWriter(DatabaseWriteHandler databaseWriteHandler){
    this.databaseHandler = databaseWriteHandler;
  }
  @Override
  public void run() {
    while (this.databaseHandler.isRunning()) {
      try{
      this.databaseHandler.writeToDB(this.databaseHandler.getNextMessage());
    } catch (Exception e) {
        throw new RuntimeException(e);
      }
    }
  }
}
