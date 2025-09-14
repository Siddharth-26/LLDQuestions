package TrafficSignal;

import java.util.List;

public class StateManager {
  private TrafficSignalController trafficSignalController;
  private List<State> stateList;
  public StateManager(TrafficSignalController trafficSignalController){
    this.trafficSignalController = trafficSignalController;
  }
  public void addState(State state){
    this.stateList.add(state);
  }
  public void triggerEmergency(String roadName){
    this.switchOffAllState();
    for (State state : stateList){
      if(state.turnGreenByName(roadName)){
        break;
      }
    }
  }
  public void switchOffAllState(){
    for (State state: stateList){
      state.turnRed();
    }
  }

}
