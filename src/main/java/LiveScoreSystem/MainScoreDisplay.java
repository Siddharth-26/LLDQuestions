package LiveScoreSystem;

public class MainScoreDisplay implements  Subscriber{
  int runs;
  int wickets;
  @Override
  public void update(Score score) {
    this.runs = score.getRuns();
    this.wickets = score.getWickets();
  }
}
