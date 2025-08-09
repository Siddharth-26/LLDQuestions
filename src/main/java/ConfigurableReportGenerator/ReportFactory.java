package ConfigurableReportGenerator;

import java.util.HashMap;

public class ReportFactory {
  HashMap<String, ReportGenerator> reportGeneratorHashMap;

  public ReportFactory(){
    this.reportGeneratorHashMap.put("PDF", new PDFReportGenerator());
    this.reportGeneratorHashMap.put("CSV", new CSVReportGenerator());
    this.reportGeneratorHashMap.put("HTML", new HTMLReportGenerator());
  }
  void addNewFormat(String type, ReportGenerator reportGenerator){
    this.reportGeneratorHashMap.put(type, reportGenerator);
  }
  public ReportGenerator getReportGenerator(String type){
    return this.reportGeneratorHashMap.get(type);
  }
}
