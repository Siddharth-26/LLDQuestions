package TicTacToe;

public class WonState implements State{
  @Override
  public void play(int x, int y, Grid grid) {
    System.out.println("The game is already over please restart a new game.");
  }
}
