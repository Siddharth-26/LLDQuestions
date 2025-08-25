package BridgeDesignPatternUIElements;

public class Menu implements UIComponents{
  private Renderers renderers;
  public Menu(Renderers renderers){
    this.renderers = renderers;
  }
  @Override
  public void draw() {
    System.out.println("Drawing the Menu" + this.renderers.rederMenu());
  }
}
