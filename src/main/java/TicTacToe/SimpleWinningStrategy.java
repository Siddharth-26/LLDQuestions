package TicTacToe;

import java.util.HashSet;

public class SimpleWinningStrategy implements WinningStrategy{
  @Override
  public boolean hasWon(Grid grid) {
    for (int i=0; i<3;i++){
      HashSet<String> set = new HashSet<>(grid.getColumn(i));
      if(set.size()==1){
        return true;
      }
    }
    for (int i=0; i<3;i++){
      HashSet<String> set = new HashSet<>(grid.getRow(i));
      if(set.size()==1){
        return true;
      }
    }
    HashSet<String> set1 = new HashSet<>(grid.getDiagonal1());
    HashSet<String> set2 = new HashSet<>(grid.getDiagonal2());
    if(set1.size()==1){
      return true;
    }
    if(set2.size()==1){
      return true;
    }
    return false;
  }

  @Override
  public boolean isDraw(Grid grid) {
    return false;
  }
}
