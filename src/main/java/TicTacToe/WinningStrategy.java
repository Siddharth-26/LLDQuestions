package TicTacToe;

public interface WinningStrategy {
  public boolean hasWon(Grid grid);
  public boolean isDraw(Grid grid);
}
