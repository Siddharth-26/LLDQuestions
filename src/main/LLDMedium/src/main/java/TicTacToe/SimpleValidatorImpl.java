package TicTacToe;

public class SimpleValidatorImpl implements Validator{

  @Override
  public boolean validate(Player currPlayer, Player playerInTurn, int row, int column, Board board) {
    if(currPlayer.equals(playerInTurn)) {
      Player player = board.getPlayer(row, column);
      return player == null;
    }
    return false;
  }
}
