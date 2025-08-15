package ConfigurableReportGenerator;

import java.util.HashMap;

public class Request {
  private String title;
  private HashMap<String, String> dataRows;
  private String footer;

  public String getTitle() {
    return title;
  }

  public HashMap<String,String> getDataRows() {
    return dataRows;
  }

  public String getFooter() {
    return footer;
  }

  private Request( Builder b){
    this.dataRows = b.dataRows;
    this.title = b.title;
    this.footer = b.footer;
  }
  public static class  Builder{
    private HashMap<String, String>dataRows;
    private String title;
    private String footer;
    public Builder title(String title){
      this.title = title;
      return this;
    }
    public Builder dataRows(HashMap<String, String> dataRows){
      this.dataRows = dataRows;
      return this;
    }
    public Builder footer(String footer){
      this.footer = footer;
      return this;
    }

    public Request  build(){
      return new Request(this);
    }

  }


  // The client is calling something like this Response.Builder.


}
