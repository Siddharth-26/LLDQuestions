package PizzaOrderingSystem;

public class Client {
  public static void main(String[] args){
//  Creating a vegie Supreme pizza
    Components vegiePizza = new VeggieSupreme();
    System.out.println(vegiePizza.getPrice());
    System.out.println(vegiePizza.getDescription());
    Components margeritaPizza = new Margherita();
    Components extraCheesemargherita = new ExtraCheeseTopping(margeritaPizza);
    Components extracheesemargheritamushrooms = new Mushrooms(extraCheesemargherita);
    System.out.println(extracheesemargheritamushrooms.getDescription());
    System.out.println(extracheesemargheritamushrooms.getPrice());
  }
 }
