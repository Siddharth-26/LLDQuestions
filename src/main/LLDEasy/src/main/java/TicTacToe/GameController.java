package TicTacToe;

import java.util.List;

public class GameController {
  private WinningStrategy winningStrategy;
  private Board board;
  private List<Players> players;
  private int currentIndex;
  public GameController(WinningStrategy winningStrategy, Board board, List<Players> players){
    this.players = players;
    this.board = board;
    this.winningStrategy = winningStrategy;
    this.currentIndex = 0;
  }
  public String makeMove(Players player, int row, int col){
    if(this.players.get(this.currentIndex)==player){
      if(this.board.checkValidMove(row, col)){
      this.currentIndex+=1;
      this.currentIndex%=this.players.size();
      this.board.setValue(row, col, player.getSymbol());
      if(this.winningStrategy.checkWin(this.board)){
       return "Congratulations you won.";
      }
      else{
        return "next Player please make your move.";
      }

    }
      else{
        return "Please make a valid move that cell is occupied.";
      }

    }
    else{
      return "Let" + this.players.get(this.currentIndex)+" make their move it is not your turn";
    }
  }
}
