package LLDQuestion.LoggingFramework;

import java.util.ArrayList;
import java.util.List;

public class ErrorLogHandler implements LogHandler{
  LogFormatter logFormatter;
  List<LogProcessor> processorList;
  LogProcessorFactory logProcessorFactory;
  public ErrorLogHandler(){
    this.logFormatter = new SimpleErrorLogFormatter();
    this.processorList = new ArrayList<LogProcessor>();
    this.logProcessorFactory = new LogProcessorFactory();
  }
  @Override
  public void handleMessage(String message) {
    String formattedMessage = this.logFormatter.formatMessage(message);
    for(LogProcessor x: this.processorList){
      x.processLog(formattedMessage);
    }
  }
  // Considering there is only 2 types of destinations here like the file type of destination and there is console type..
  public boolean addProcessor(DestinationConfiguration destinationConfiguration){
    LogProcessor processor = this.logProcessorFactory.getLogProcessor(destinationConfiguration.getType());
    processor.setDestination(destinationConfiguration.getDestinationPath());
    this.processorList.add(processor);
    return true;
  }
}
