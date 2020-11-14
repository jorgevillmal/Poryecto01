package proyecto1;

import menu.*;
import robot.Robot;

public class Run{
    public static void main(String[] args){

        MenuBurrito burrito = new MenuBurrito("BURRITOS", "LOCOS");
        MenuComponent pizzas = new MenuHamburguesas("PIZAZ", "HAPPY");
        MenuComponent hamburguesas = new MenuHamburguesas("HAMBURGUESAS","CHIDASS");

        MenuComponent allMenus = new Menu("TODOS LOS MENUS", "FDSFS");


        allMenus.add(burrito);
        allMenus.add(pizzas);
        allMenus.add(hamburguesas);

        burrito.add(new MenuItem("MEXICAN BURRITO", "CALIENTE", 27));
        burrito.add(new MenuItem("CLASSIC BURRITO", "EL CLASICO", 25));

        pizzas.add(new MenuItem("HAWAIANNA","con piña y jamon",100));
        pizzas.add(new MenuItem("ALLMEATS","con chorizo y SALAMAI",100));

        hamburguesas.add(new MenuItem("CLASSIC HAMBURGUER","CON QUESO Y CARNE",50));

        Robot robot = new Robot(allMenus);
        robot.printMenu();
    
    }
}   
