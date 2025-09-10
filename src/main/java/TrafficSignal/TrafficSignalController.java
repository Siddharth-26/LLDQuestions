package TrafficSignal;

public abstract class TrafficSignalController {
  // This will have a state Object that will contain the currently active state Or road that has the green signal.
  private State state;
  private StateManager stateManager;
  public void increaseNorthSouthTraffic(int seconds){}
  public void increaseEastWestBoundTraffic(int seconds){}
  public void triggerEmergency(String roadName){
    this.stateManager.triggerEmergency(roadName);
  }
  public void setState(State state){
    this.state = state;
  }
  public void switchOn(){
    this.state.turnGreen();
  }
  public void triggerNormal(){
    this.stateManager.switchOffAllState();
    this.switchOn();
  }
}
