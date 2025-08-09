package ConfigurableReportGenerator;

// This is a singleton immutable configuration if you want to have multiple configs then you need to create them separately..
public class Configuration {
  private String reportType;
  private Configuration instance;

  public void setReportType(String type) {
    this.reportType = type;
  }

  public String getReportType() {
    return reportType;
  }

  private Configuration(String type){
    this.reportType = type;
  }
  public Configuration getConfiguration(String type){
    if(this.instance!=null){
      return this.instance;
    }
    else{
      return new Configuration(type);
    }
  }
}
