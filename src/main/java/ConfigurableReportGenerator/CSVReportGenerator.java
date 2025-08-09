package ConfigurableReportGenerator;

import java.util.HashMap;

public class CSVReportGenerator implements ReportGenerator{
  @Override
  public String generateReport(Request request) {
    String output = "";
    HashMap<String, String> dataRows = request.getDataRows();
    String title = request.getTitle();
    String footer = request.getFooter();
    // Add to the output string the title and the datarows and then return that in the proper format.. according the the HTML report generation rules..
    return output;
  }
}
