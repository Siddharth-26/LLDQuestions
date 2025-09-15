package TicTacToe;
// This class is Responsible for orchestrating the game from behind or is the actual brain...
public class GameController {
  WinningStrategy winningStrategy;
  public GameController(WinningStrategy winningStrategy){
    this.winningStrategy = winningStrategy;
  }
  public ResultType play(int x, int y, Grid grid, String icon){
    if(grid.validateMove(x, y)){
      grid.put(x, y, icon);
      if(this.winningStrategy.hasWon(grid)){
        return ResultType.WON;
      }
      else{
        if(this.winningStrategy.isDraw(grid)){
          return ResultType.DRAW;
        }
      }
      return ResultType.NORMAL;
    }
    else{
      return ResultType.INVALID;
    }
  }
}
