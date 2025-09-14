package CricBuzz;

import java.util.List;

public class Team {
  private String teamName;
  private String teamId;
  private List<Player> playerList;

  public Team(String teamName, String teamId, List<Player> playerList) {
    this.teamName = teamName;
    this.teamId = teamId;
    this.playerList = playerList;
  }

  public String getTeamName() {
    return teamName;
  }

  public void setTeamName(String teamName) {
    this.teamName = teamName;
  }

  public String getTeamId() {
    return teamId;
  }

  public void setTeamId(String teamId) {
    this.teamId = teamId;
  }

  public List<Player> getPlayerList() {
    return playerList;
  }

  public void addPlayer(Player player) {
    this.playerList.add(player);
  }
}
