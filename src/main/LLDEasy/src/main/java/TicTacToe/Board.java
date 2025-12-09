package TicTacToe;

import java.util.ArrayList;
import java.util.List;

public class Board {
  private int size;
  private List<List<String>> board;
  public Board(int size){
    this.size = size;
    for (int i=0;i<size; i++)
    {
      List<String> list = new ArrayList<>();
      for (int j=0;j<size;j++){
        list.add(null);
      }
      this.board.add(list);
    }
  }
  public boolean checkValidMove(int row, int col){
    if(this.board.get(row).get(col)==null){
      return true;
    }
    return false;
  }
  public int getSize(){
    return this.size;
  }
  public List<String> getRow(int row){
    return this.board.get(row);
  }
  public List<String> getColumn(int column){
    List<String> lst = new ArrayList<>();
    for(int i =0;i< board.size();i++){
      lst.add(board.get(i).get(column));
    }
    return lst;
  }
  public void setValue(int row, int col, String symbol){
    this.board.get(row).set(col, symbol);
  }
}
