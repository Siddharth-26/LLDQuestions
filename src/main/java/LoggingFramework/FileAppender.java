package LoggingFramework;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class FileAppender implements Appender{
  private Appender childAppender;
  private String outputPath;
  @Override
  public void addAppender(Appender appender) {
    this.childAppender = appender;
  }

  @Override
  public void log(String message) {
    this.writeToFile(message);
    if(this.childAppender!=null){
    this.childAppender.log(message);}
  }

  @Override
  public void setOutputdestination(String path) {
  this.outputPath = path;
  }
  private void writeToFile(String message){
    try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(outputPath, false));){
      System.out.println("lansdflkansdlf"+ message + outputPath);
      File f = new File(outputPath);
      System.out.println("Writable: " + f.canWrite() + f.getAbsolutePath());
      bufferedWriter.write(message);
      bufferedWriter.newLine();
    } catch (Exception e) {
      System.out.println(e);
    }
    System.out.println("skldnlksndf");
  }
}
