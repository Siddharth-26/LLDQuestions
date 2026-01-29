package BookMyShow;

import java.time.Instant;

public class Shows {
  private String movieName;
  private Screen screen;
  private Instant showTime;
  public Shows(String movieName, Screen screen, Instant showTime){
    this.movieName = movieName;
    this.screen = screen;
    this.showTime = showTime;
  }

  public String getMovieName() {
    return movieName;
  }

  public void setMovieName(String movieName) {
    this.movieName = movieName;
  }

  public Screen getScreen() {
    return screen;
  }

  public void setScreen(Screen screen) {
    this.screen = screen;
  }

  public Instant getShowTime() {
    return showTime;
  }

  public void setShowTime(Instant showTime) {
    this.showTime = showTime;
  }

}
