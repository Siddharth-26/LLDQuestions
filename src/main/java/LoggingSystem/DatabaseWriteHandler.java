package LoggingSystem;

import java.util.LinkedList;

public class DatabaseWriteHandler implements WriteHandler{

  private final String username;
  private final String password;
  private final String url;
  private LinkedList<String> queue;
  private boolean running = true;

  public DatabaseWriteHandler(String url, String userName, String password){
    this.username = userName;
    this.password = password;
    this.url = url;
    Thread databaseWriterThread = new Thread(new DatabaseWriter(this));
    databaseWriterThread.start();
  }

  @Override
  public void writeMessageToDestination(String message) {
    this.writeMessageToQueue(message);
  }
  private void writeMessageToQueue(String message){
    queue.offerLast("Written to DB: "+ message);
  }
  public String getNextMessage(){
    return this.queue.pollFirst();
  }

  public synchronized void writeToDB(String nextMessage) {
    // This will contain the logic to get the connection from the datasource and perform the SQL insert query to the DB, for now just printing written message to DB;
    System.out.println("Writing to DB" + nextMessage);
  }
  public boolean isRunning(){
    return this.running;
  }
}
