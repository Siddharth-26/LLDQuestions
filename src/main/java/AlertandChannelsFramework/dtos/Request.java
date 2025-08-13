package AlertandChannelsFramework.dtos;

import AlertandChannelsFramework.AlertTypes;
import AlertandChannelsFramework.ChanelTypes;

public class Request {
  private AlertTypes alertType;
  private ChanelTypes primaryChanel;
  private ChanelTypes secondaryChanel;
  private String subject;
  private String text;

  public void setSubject(String subject) {
    this.subject = subject;
  }

  public void setText(String text) {
    this.text = text;
  }

  public AlertTypes getAlertType() {
    return alertType;
  }

  public ChanelTypes getPrimaryChanel() {
    return primaryChanel;
  }

  public ChanelTypes getSecondaryChanel() {
    return secondaryChanel;
  }

  public String getSubject() {
    return subject;
  }

  public String getText() {
    return text;
  }

  private Request(Builder b){
     AlertTypes alertType = b.alertType;
     ChanelTypes primaryChanel = b.primaryChanel;
     ChanelTypes secondaryChanel = b.secondaryChanel;
     String subject = b.subject;
     String text = b.text;
  }

  public static class Builder{
    private AlertTypes alertType;
    private ChanelTypes primaryChanel;
    private ChanelTypes secondaryChanel;
    private String subject;
    private String text;
    public Builder alertType(AlertTypes alertType){
      this.alertType = alertType;
      return this;
    }
    public Builder primaryChanel(ChanelTypes primaryChanel){
      this.primaryChanel = primaryChanel;
      return this;
    }
    public Builder secondaryChanel(ChanelTypes secondaryChanel){
      this.secondaryChanel = secondaryChanel;
      return this;
    }
    public Builder subject(String subject){
      this.subject = subject;
      return this;
    }
    public Builder text(String text){
      this.text = text;
      return this;
    }
    public Request Builder(){
      return new Request(this);
    }
  }
}
