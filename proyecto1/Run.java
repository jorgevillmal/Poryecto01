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

        burrito.add(new Burrito("MEXICAN BURRITO", "CALIENTE", 27, 1));
        burrito.add(new Burrito("CLASSIC BURRITO", "EL CLASICO", 25, 2));
        burrito.add(new Burrito("BURRITO RANCHERO", "CLASICO", 75, 3));
        burrito.add(new Burrito("BURRO BBQ", "ESPECIAL", 100, 4));
        burrito.add(new Burrito("CARNE ASADA", "ESPECIAL", 90, 5));

        pizzas.add(new Pizza("HAWAIANNA","con piña y jamon",100, 1));
        pizzas.add(new Pizza("ALLMEATS","con chorizo y SALAMAI",100,2));
        pizzas.add(new Pizza("FLORENTINA","tomate, queso paremesano y espinacas",160, 3));
        pizzas.add(new Pizza("JULIANA","pepperoni, cebolla y jalapeno",120, 4));
        pizzas.add(new Pizza("VERONA","chistorra, salami, queso crema",140, 5));

        hamburguesas.add(new Hamburguesa("4 quesos","Carne, salsa de quedo",100, 1));
        hamburguesas.add(new Hamburguesa("ALLMEATS","con chorizo y SALAMAI",100,2));
        hamburguesas.add(new Hamburguesa("FLORENTINA","tomate, queso paremesano y espinacas",160, 3));
        hamburguesas.add(new Hamburguesa("JULIANA","pepperoni, cebolla y jalapeno",120, 4));
        hamburguesas.add(new Hamburguesa("VERONA","chistorra, salami, queso crema",140, 5));


        hamburguesas.add(new MenuItem("CLASSIC HAMBURGUER","CON QUESO Y CARNE",50));

        Robot robot = new Robot(allMenus);
        robot.printMenu();

    }
}
