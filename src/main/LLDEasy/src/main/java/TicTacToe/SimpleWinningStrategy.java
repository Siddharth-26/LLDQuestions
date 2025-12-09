package TicTacToe;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SimpleWinningStrategy implements WinningStrategy{

  @Override
  public boolean checkWin(Board board) {
    for (int i=0;i<board.getSize();i++){
      List<String> chars = board.getRow(i);
      Set<String> stringSet = new HashSet<String>(chars);
      if(stringSet.size()==1) {
        return true;
      }
    }
    for(int i=0;i< board.getSize();i++){
      List<String> chars  = board.getColumn(i);
      Set<String> stringSet = new HashSet<String>(chars);
      if(stringSet.size()==1){
        return true;
      }
    }
    Set<String> set = new HashSet<String>();
    for(int i=0;i< board.getSize();i++){
        set.add(board.getRow(i).get(i));
    }
    if(set.size()==1){
      return true;
    }
    Set<String> set1 = new HashSet<String>();
    for(int i= board.getSize();i>=0;i--){
      set1.add(board.getRow(i).get(i));
    }
    if(set1.size()==1){
      return true;
    }
    return false;
  }
}
