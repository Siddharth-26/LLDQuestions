package ConnectFour;

import java.util.List;

public class Orchestrator {
  int currTurnPlayer;
  Board board;
  List<Player> playerList;
  public Orchestrator(Player player1, Player player2){
    this.currTurnPlayer = 0;
    this.playerList.add(player1);
    this.playerList.add(player2);
    this.board = new Board();
  }
  public boolean makeMove(Player player, int column){
    if(this.board.checkBoardFull()){
      System.out.println("Draw");
      return false;
    }
    boolean hasPut =  this.board.putCoin(column, player);
    this.currTurnPlayer+=1;
    this.currTurnPlayer%=this.playerList.size();
    return hasPut;
  }
  public Player checkWinner(){
    return this.board.checkWinner();
  }
  public Player checkCurrentPlayer(){
    return this.playerList.get(currTurnPlayer);
  }
}

