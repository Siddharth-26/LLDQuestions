package TicTacToe;

public interface Validator {
  public boolean validate(Player currPlayer, Player playerInTurn, int row, int column, Board board);

}
