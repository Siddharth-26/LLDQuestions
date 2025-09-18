package TicTacToe;

import java.util.ArrayList;
import java.util.List;

public class Grid {
  List<List<String>> grid = new ArrayList<>();
  public Grid(){
    for (int i=0; i<3;i++){
      List<String> row = new ArrayList<>();
      for(int j=0;j<3;j++){
        row.add(null);
      }
      this.grid.add(row);
    }
  }
  public boolean validateMove(int x, int y){
    if(this.grid.get(x).get(y)==null){
      return true;
    }
    else{
      return false;
    }
  }
  public void put(int x, int y, String icon){
    this.grid.get(x).set(y, icon);
  }
  public List<String> getRow(int i){
    return this.grid.get(i);
  }
  public List<String> getColumn(int i){
    List<String> currColumn = new ArrayList<>();
    for (int x=0; x<3; x++){
      currColumn.add(this.grid.get(x).get(i));
    }
    return currColumn;
  }
  public List<String> getDiagonal1(){
    List<String> diagonal = new ArrayList<>();
    for (int x=0; x<3; x++){
      diagonal.add(this.grid.get(x).get(x));
    }
    return diagonal;
  }
  public List<String> getDiagonal2(){
    List<String> diagonal = new ArrayList<>();
    int j = 2;
    for (int x=0; x<3; x++){
      diagonal.add(this.grid.get(x).get(j));
    }
    return diagonal;
  }
}
