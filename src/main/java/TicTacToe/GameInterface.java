package TicTacToe;

public class GameInterface {
  State state;
  Grid grid;
  GameController gameController;
  public GameInterface(WinningStrategy winningStrategy){
    this.grid = new Grid();
    this.gameController = new GameController(winningStrategy);
  }

  public void play(int x, int y){
    this.state.play(x, y, grid);
  }
  public void setState(State state){
    this.state = state;
  }
}
