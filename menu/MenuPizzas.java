package menu;

import java.util.Iterator;

public class MenuPizzas extends Menu{
    private MenuComponent[] arregloPizzas = new MenuComponent[4];
    private String name;
    private String description;
    private int numberItems = 0;
    private static final int max = 4;

    public MenuPizzas(String name, String description){
        this.name = name;
        this.description = description;
    }

    public MenuPizzas(){
        this.name = "";
        this.description = "";
    }

    public String getName(){
        return name;
    }

    public String getDescription(){
        return description;
    }

    public void add(MenuComponent menuComponent) {
        if (numberItems >= max ) {
            System.out.println("Ya no caben recuerda que el menu solo contiene 4 pizzas");

        }   else {
                arregloPizzas[numberItems] = menuComponent;
            }
    }

    public void remove(MenuComponent menuComponent){
        if (numberItems <= 0 ) {
            System.out.println("Ya no hay");
        }   else {
            arregloPizzas[numberItems] = menuComponent;
        }
    }

    public MenuComponent getChild(int i){
        return arregloPizzas[i];
    }


    public void print(){

        iteradorPizza itr = createIterator();
        System.out.print("\n" + getName());
        System.out.println(",  "  + getDescription());
        System.out.println("---------------------------");
        while (itr.hasNext()) {
            MenuComponent menuComponent = (MenuComponent) itr.next();
            menuComponent.print();
        }

    }

    public iteradorPizza createIterator() {
        return new iteradorPizza(arregloPizzas);
    }

}