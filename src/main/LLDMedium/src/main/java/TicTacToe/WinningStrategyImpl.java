package TicTacToe;

import java.util.List;

public class WinningStrategyImpl implements WinningStrategy{
  @Override
  public boolean hasPlayerWon(Player currPlayer, Board board) {
    List<List<Integer>> lst = board.getGridSpotForPLayer(currPlayer);
    if(this.columnCheck(lst) || this.rowCheck(lst) || this.diagonalCheck(lst)){
      return true;
    }
    return false;
  }

  @Override
  public boolean isDraw(Board board) {
    // Check the complete board if everything is filled up then we are going to just return that the game draw...
    return false;
  }
  private boolean rowCheck(List<List<Integer>> lst){
    // logic to check if the same player is having all the rows occupied for a certain column...
    return false;
  }
  private boolean columnCheck(List<List<Integer>> lst){
    // logic to check if the same player is having all the columns occupied for a certain row....
    return false;

  }
  private boolean  diagonalCheck(List<List<Integer>> lst){
    // Check both primary diagonal and secondary diagonal...
    return false;
  }
}
