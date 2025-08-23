package LiveScoreSystem;

public class ScoreCardManager extends Publisher{
  Score score;
  public ScoreCardManager(){
    super();
    this.score = new Score();
  }
  public void hitFour(){
    this.score.setFours(this.score.getFours()+1);
    this.score.setRuns(this.score.getRuns()+4);
    super.notifySubscribers(this.score);
  }
  public void hitSix(){
    this.score.setSixes(this.score.getSixes()+1);
    this.score.setRuns(this.score.getRuns()+6);
    super.notifySubscribers(this.score);

  }
  public void takeSingle(){
    this.score.setRuns(this.score.getRuns()+1);
    super.notifySubscribers(this.score);
  }
  public void takeDouble(){
    this.score.setRuns(this.score.getRuns()+2);
    super.notifySubscribers(this.score);
  }
  public void takeTriple(){
    this.score.setRuns(this.score.getRuns()+3);
    super.notifySubscribers(this.score);
  }
  public void takeWicket(){
    this.score.setWickets(this.score.getWickets()+1);
    super.notifySubscribers(this.score);
  }
}
