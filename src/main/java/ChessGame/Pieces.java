package ChessGame;

public interface Pieces {
  public boolean canMove(int startX, int startY, int endX, int endY);
  public void checkOponentKing();
}
