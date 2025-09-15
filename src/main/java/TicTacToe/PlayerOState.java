package TicTacToe;

public class PlayerOState implements State {
  GameInterface gameInterface;
  public PlayerOState(GameInterface gameInterface){
    this.gameInterface = gameInterface;
  }
  @Override
  public void play(int x, int y, Grid grid) {
    ResultType resultType = this.gameInterface.gameController.play(x, y, grid, "O");
    if(resultType==ResultType.NORMAL){
      this.gameInterface.setState(new PlayerXState(this.gameInterface));
    }
    else if(resultType==ResultType.INVALID){
      System.out.println("INVALID MOVE by Player O... please try once more...");
    }
    else if(resultType==ResultType.DRAW){
      System.out.println("There is a draw.... Start a new Game please...");
    }
    else{
      System.out.println("Congratulations..... Player O has won the game....");
    }
  }
}
