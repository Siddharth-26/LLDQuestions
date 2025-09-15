package TicTacToe;

public class PlayerXState implements State{
  GameInterface gameInterface;
  public PlayerXState(GameInterface gameInterface){
    this.gameInterface = gameInterface;
  }
  @Override
  public void play(int x, int y, Grid grid) {
    ResultType resultType = this.gameInterface.gameController.play(x, y, grid, "X");
    if(resultType==ResultType.NORMAL){
      this.gameInterface.setState(new PlayerOState(this.gameInterface));
    }
    else if(resultType==ResultType.INVALID){
      System.out.println("INVALID MOVE by Player X... please try once more...");
    }
    else if(resultType==ResultType.DRAW){
      System.out.println("There is a draw.... Start a new Game please...");
    }
    else{
      System.out.println("Congratulations..... Player X has won the game....");
    }
  }
}
