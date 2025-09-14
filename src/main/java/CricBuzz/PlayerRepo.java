package CricBuzz;

import java.util.HashMap;

public class PlayerRepo {
  private final HashMap<String,Player> playerHashMap;

  public PlayerRepo(HashMap<String, Player> playerHashMap){
    this.playerHashMap = playerHashMap;
  }
  public Player getPlayer(String playerId){
    return this.playerHashMap.get(playerId);
  }
}
