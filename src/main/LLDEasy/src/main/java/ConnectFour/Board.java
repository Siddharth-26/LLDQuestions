package ConnectFour;

import java.util.ArrayList;
import java.util.HashMap;

public class Board {
  private ArrayList<ArrayList<Player>> board = new ArrayList<>();
  public Board(){
    for (int i=0;i<7;i++) {
      this.board.add(new ArrayList<Player>(6));
    }
  }
  public boolean putCoin(int column, Player player){
    if(this.board.get(0).get(column)!=null){
      return false;
    }
    else{
      int index = 0;
      for (int i = 0;i<7;i++){
        if(this.board.get(i).get(column)!=null){
          index = i;
          break;
        }
      }
      this.board.get(index-1).add(column, player);
      return true;
    }
  }
  public boolean checkBoardFull(){
    for(int i=0;i<this.board.size();i++){
      for(int j=0;j<this.board.get(0).size();j++){
        if(this.board.get(i).get(j)!=null){
          continue;
        }
        else{
          return false;
        }
      }
    }
    return true;
  }
  public Player checkWinner(){
    Player winner = null;
    winner = this.checkHorizontal();
    if(winner!=null) {
      return winner;
    }
    winner = this.checkVertical();
    if(winner!=null){
      return winner;
    }
    winner = this.checkDiagonal();
    if(winner!=null){
      return winner;
    }
  return winner;
  }
  private Player checkHorizontal(){
    for (int i=0;i<this.board.get(0).size();i++){
      for (int j=0;j<this.board.size();j++){
        Player winner = null;
        int start = j;
        HashMap<Player, Integer> map = new HashMap<>();
        while(start<this.board.size() && start<j+4){
          map.put(this.board.get(start).get(i), 1);
          start+=1;
        }
        if(map.size()==1 && this.board.get(j).get(i)!=null){
          return this.board.get(j).get(i);
        }
      }
    }
    return null;
  }
  private Player checkVertical(){
    for (int i=0;i<this.board.size();i++){
      for (int j=0;j<this.board.get(0).size();j++){
        Player winner = null;
        int start = j;
        HashMap<Player, Integer> map = new HashMap<>();
        while(start<this.board.size() && start<j+4){
          map.put(this.board.get(i).get(start), 1);
          start+=1;
        }
        if(map.size()==1 && this.board.get(i).get(j)!=null){
          return this.board.get(i).get(j);
        }
      }
    }
    return null;
  }
  private Player checkDiagonal(){
    for(int i =0;i<this.board.size();i++){
      for(int j=0; j<this.board.get(0).size();j++){
        int starti = i;
        int startj = j;
        HashMap<Player, Integer> map = new HashMap<>();
        while(starti<this.board.size() && startj<this.board.get(0).size()){
          map.put(this.board.get(starti).get(startj), 1);
          starti+=1;
          startj+=1;
        }
        if(map.size()==1 && this.board.get(i).get(j)!=null){
          return this.board.get(i).get(j);
        }
      }
    }
    return null;
  }
}
