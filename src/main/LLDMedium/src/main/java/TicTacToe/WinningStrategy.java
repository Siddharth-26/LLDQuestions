package TicTacToe;

public interface WinningStrategy {
  public boolean hasPlayerWon(Player currPlayer, Board board);
  public boolean isDraw(Board board);
}
