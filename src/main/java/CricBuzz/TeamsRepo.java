package CricBuzz;

import java.util.HashMap;

public class TeamsRepo {
  private final HashMap<String,Team> teamHashMap;

  public TeamsRepo(HashMap<String, Team> teamHashMap){
    this.teamHashMap = teamHashMap;
  }
  public Team getTeam(String teamId){
    return this.teamHashMap.get(teamId);
  }
}
