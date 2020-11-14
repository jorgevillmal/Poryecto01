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

        burrito.add(new Burrito("MEXICAN BURRITO", "CALIENTE", 27));
        burrito.add(new Burrito("CLASSIC BURRITO", "EL CLASICO", 25));
        burrito.add(new Burrito("BURRITO RANCHERO", "CLASICO", 75));
        burrito.add(new Burrito("BURRO BBQ", "ESPECIAL", 100));
        burrito.add(new Burrito("CARNE ASADA", "ESPECIAL", 90));

        pizzas.add(new Pizza("HAWAIANNA","con piña y jamon",100));
        pizzas.add(new Pizza("ALLMEATS","con chorizo y SALAMAI",100));
        pizzas.add(new Pizza("FLORENTINA","tomate, queso paremesano y espinacas",160));
        pizzas.add(new Pizza("JULIANA","pepperoni, cebolla y jalapeno",120));
        pizzas.add(new Pizza("VERONA","chistorra, salami, queso crema",140));



        hamburguesas.add(new MenuItem("CLASSIC HAMBURGUER","CON QUESO Y CARNE",50));

        Robot robot = new Robot(allMenus);
        robot.printMenu();
    
    }
}   
