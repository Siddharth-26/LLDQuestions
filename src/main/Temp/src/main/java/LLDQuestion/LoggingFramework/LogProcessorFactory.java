package LLDQuestion.LoggingFramework;

public class LogProcessorFactory {
  public LogProcessor getLogProcessor(DestinationType destinationType){
    if(destinationType.equals(DestinationType.FILE)){
      return new FileLogProcessor();
    }
    else{
      // For now returning file log processor but there should be some default one like console or something.
      return new FileLogProcessor();
    }
  }
}
