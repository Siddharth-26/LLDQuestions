package ConfigurableReportGenerator;

public class GenerateReportHandler {
  ReportGenerator reportGenerator;
  public GenerateReportHandler(Configuration config){
    this.reportGenerator = new ReportFactory().getReportGenerator(config.getReportType());
  }
  public String generateReport(Request request){
    return this.reportGenerator.generateReport(request);
  }
}
