package TicTacToe;

import java.util.ArrayList;
import java.util.List;

public class Board {
  private Player[][] board;
  private int N;

  public Board(int numberOfRows) {
    this.board = new Player[numberOfRows][numberOfRows];
    this.N = numberOfRows;
  }
  public void setPlayer(int row, int column, Player player){
    this.board[row][column] = player;
    return ;
  }
  public List<List<Integer>> getGridSpotForPLayer(Player player){
    List<List<Integer>> lst = new ArrayList<>();
    for(int i=0;i<this.N;i++){
      for(int j=0;j<this.N;j++){
        Player currPlayer = this.board[i][j];
        if(currPlayer!=null && currPlayer.equals(player)){
          List<Integer> temp1 = new ArrayList<>();
          temp1.add(i);
          temp1.add(j);
          lst.add(temp1);
        }
      }
    }
    return lst;
  }
  public Player getPlayer(int row, int column){
    return this.board[row][column];
  }
}
