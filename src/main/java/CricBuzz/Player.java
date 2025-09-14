package CricBuzz;

public class Player {
  private String playerId;
  private String playerName;
  private String teamName;
  private String playerDetails;

  public Player(String playerId, String playerName, String teamName, String playerDetails) {
    this.playerId = playerId;
    this.playerName = playerName;
    this.teamName = teamName;
    this.playerDetails = playerDetails;
  }

  public String getPlayerId() {
    return playerId;
  }

  public void setPlayerId(String playerId) {
    this.playerId = playerId;
  }

  public String getPlayerName() {
    return playerName;
  }

  public void setPlayerName(String playerName) {
    this.playerName = playerName;
  }

  public String getTeamName() {
    return teamName;
  }

  public void setTeamName(String teamName) {
    this.teamName = teamName;
  }

  public String getPlayerDetails() {
    return playerDetails;
  }

  public void setPlayerDetails(String playerDetails) {
    this.playerDetails = playerDetails;
  }
}
