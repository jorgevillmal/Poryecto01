package menu;

import java.util.ArrayList;
import java.util.Iterator;

public class MenuHamburguesas extends Menu{
    private ArrayList<MenuComponent> listaHamburguesas = new ArrayList<MenuComponent>();
    private String name;
    private String description;
    private int numberItems = 0;  

    public MenuHamburguesas(String name, String description){
        this.name = name;
        this.description = description;
    }

    public MenuHamburguesas(){
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
        listaHamburguesas.add(menuComponent);
    }

    public void remove(MenuComponent menuComponent){
        listaHamburguesas.remove(menuComponent);
    }

    public MenuComponent getChild(int i){
        return listaHamburguesas.get(i);
    }


     public void print(){

     Iterator<MenuComponent> itr = listaHamburguesas.iterator();
     System.out.print("\n" + getName());
     System.out.println(",  "  + getDescription());
     System.out.println("---------------------------");
     while (itr.hasNext()) {
     MenuComponent menuComponent = (MenuComponent) itr.next();
     menuComponent.print();
     }

     }

    public CompositeIterator createIterator() {
        return new CompositeIterator(listaHamburguesas.iterator());
    }

}