package CricBuzz;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Matches implements  Publisher{
  private List<Subscriber> subscriberList;
  private Team team1;
  private Team team2;
  private List<Double> scoreTeam1 = new ArrayList<>();
  private List<Double> scoreTeam2 = new ArrayList<>();
  private List<Double> battingTeam;
  private Date matchDate;

  public Matches(Team team1, Team team2, Date date) {
    this.subscriberList = new ArrayList<>();
    this.team1 = team1;
    this.team2 = team2;
    this.battingTeam = scoreTeam1;
    this.matchDate = date;
  }
  public void incrementScore(){
  Double runs = this.battingTeam.get(0);
  this.battingTeam.add(0, runs+1);
  }
  public void incrementWicket(){
    Double wicket = this.battingTeam.get(1);
    this.scoreTeam1.add(1, wicket);
  }
  public void switchTeams(){
  this.battingTeam  = scoreTeam2;
  }
  @Override
  public void addSubscriber(Subscriber subscriber) {
  this.subscriberList.add(subscriber);
  }

  @Override
  public void removeSubscriber(Subscriber subscriber) {
  this.subscriberList.remove(subscriber);
  }

  @Override
  public void notifySubscribers() {
    for(Subscriber user:this.subscriberList){
      user.update(this.toString());
    }
  }

  @Override
  public String toString() {
    return "Matches{" + ", team1=" + team1 + ", team2=" + team2 +
        ", scoreTeam1=" + scoreTeam1 + ", scoreTeam2=" + scoreTeam2 + '}';
  }

  public Date getMatchDate() {
    return matchDate;
  }

  public void setMatchDate(Date matchDate) {
    this.matchDate = matchDate;
  }
}
