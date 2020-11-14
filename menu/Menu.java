package menu;

import java.util.ArrayList;
import java.util.Iterator;

public class Menu extends MenuComponent{
    String name;
    String description;
    ArrayList<MenuComponent> menuComponent= new ArrayList<MenuComponent>();
    /*
    public abstract void add(MenuComponent menuComponent);
    public abstract void remove(MenuComponent menuComponent);
    public abstract void print();
    */

    public Menu(String name, String description){
        this.name = name;
        this.description = description;
    }

    public Menu(){
        this.name = "";
        this.description = "";
    }

    public String getName(){
        return name;
    }

    public String getDescription(){
        return description;
    }
    
    @Override
    public void add(MenuComponent menuComponent){
        this.menuComponent.add(menuComponent);
    }
    
    @Override
   public void print(){

        Iterator<MenuComponent> itr = menuComponent.iterator();
        System.out.print("\n" + getName());
        System.out.println(",  "  + getDescription());
        System.out.println("---------------------------");
        while (itr.hasNext()) {
           MenuComponent menuComponent = (MenuComponent) itr.next();
           menuComponent.print();
        }

    }


}
