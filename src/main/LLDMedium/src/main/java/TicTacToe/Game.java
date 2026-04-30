package TicTacToe;

import java.util.List;

public class Game {
  private Board board;
  private List<Player> playerList;
  private int pointer;
  private Validator validator;
  private WinningStrategy winningStrategy;
  private Player currPlayer;
  public Game(int N, List<Player> playerList){
    this.playerList = playerList;
    this.board = new Board(N);
    this.pointer = 0;
    this.currPlayer = playerList.get(pointer);
  }
  public synchronized void makeMove(Player player, int row, int column){
    if(validator.validate(player, currPlayer, row, column, this.board)){
      this.board.setPlayer(row, column, player);
      if(this.winningStrategy.hasPlayerWon(player, this.board)){
        System.out.println("Congratulations "+ player.getPlayerName()+" you have won the game");
      }
      else{
        if(this.winningStrategy.isDraw(this.board)){
          System.out.println("This game has ended in a draw GGs");
        }
        else{
          this.pointer+=1;
          this.pointer%=this.playerList.size();
          this.currPlayer = this.playerList.get(this.pointer);
        }
      }
    }
    else{
      System.out.println("This is not a valid move.. Please play a valid move... either it is not your turn or you are filling an already filled grid box.");
    }
  }
}
