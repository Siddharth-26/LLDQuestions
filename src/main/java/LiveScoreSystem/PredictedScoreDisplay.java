package LiveScoreSystem;

public class PredictedScoreDisplay implements Subscriber{
  int predictedRuns;

  @Override
  public void update(Score score) {
    double runRate = score.getRuns()/score.getOvers();
    double remaining = 50-score.getOvers();
    this.predictedRuns = score.getRuns()+(int)(runRate*remaining);
  }
}
