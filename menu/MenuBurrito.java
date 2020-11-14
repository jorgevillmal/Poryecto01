package menu;

import java.util.Hashtable;
import java.util.Iterator;

public class MenuBurrito extends Menu {
    private Hashtable<String,MenuComponent> tablaBurritos  = new Hashtable();
    private String name;
    private String description;


    public MenuBurrito(String name, String description){
        this.name = name;
        this.description = description;
    }

    public MenuBurrito(){
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
    public void add(MenuComponent menuComponent) {
        tablaBurritos.put(menuComponent.getName(), menuComponent);
    }

    public void remove(MenuComponent menuComponent){
        tablaBurritos.remove(menuComponent.getName());
    }

    public MenuComponent getChild(String key){
        return (MenuComponent) tablaBurritos.get(key);
    }

    public void print(){

        Iterator<MenuComponent> itr = tablaBurritos.values().iterator();
        System.out.print("\n" + getName());
        System.out.println(",  "  + getDescription());
        System.out.println("---------------------------");
        while (itr.hasNext()) {
           MenuComponent menuComponent = (MenuComponent) itr.next();
           menuComponent.print();
        }

    }
    public Iterator createIterador() {
        return new CompositeIterator(tablaBurritos.values().iterator());
    }
}