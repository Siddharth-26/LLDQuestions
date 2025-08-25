package BridgeDesignPatternUIElements;

public class Buttons implements UIComponents{
  private Renderers renderers;
  public Buttons(Renderers renderers){
    this.renderers = renderers;
  }
  @Override
  public void draw() {
    System.out.println("Drawing the Button."+ this.renderers.render());
  }
}
