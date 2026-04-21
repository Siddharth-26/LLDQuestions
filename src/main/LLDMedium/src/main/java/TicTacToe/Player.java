package TicTacToe;

public class Player {
  private String playerName;
  private String playerIcon;

  public Player(String playerName, String playerIcon) {
    this.playerName = playerName;
    this.playerIcon = playerIcon;
  }

  public String getPlayerName() {
    return playerName;
  }

  public void setPlayerName(String playerName) {
    this.playerName = playerName;
  }

  public String getPlayerIcon() {
    return playerIcon;
  }

  public void setPlayerIcon(String playerIcon) {
    this.playerIcon = playerIcon;
  }
}
