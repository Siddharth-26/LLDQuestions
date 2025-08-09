package ConfigurableReportGenerator;

import java.util.HashMap;

public class Main {
  HashMap<String, String> dataRowMap = new HashMap<>();
  Request request = new Request.Builder().title("Something").dataRows(dataRowMap).footer("Ending").build();

}
