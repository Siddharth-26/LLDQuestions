package BridgeDesignPatternUIElements;


public class Client {
  public static void main(String[] args){
    WindowsRenderer windowsRenderer = new WindowsRenderer();
    Buttons button = new Buttons(windowsRenderer);
    button.draw();
    Menu menu = new Menu(windowsRenderer);
    menu.draw();
    MacOSRenderer macOSRenderer = new MacOSRenderer();
   Buttons buttons = new Buttons(macOSRenderer);
   buttons.draw();
    Menu menu2 = new Menu(macOSRenderer);
    menu2.draw();

  }
}
