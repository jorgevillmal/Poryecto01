
package menu;

import java.util.Iterator;

public class MenuItem extends MenuComponent{
    private String name;
    private String description;
    private double price;
    private int id;

    public MenuItem(String name, String description, double price,int id) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.id = id;
    }
    
    public MenuItem() {
        
    }
    
    public String getName() {
        return name;
    }

    public String getDescription(){
        return description;
    }

    public double getPrice() {
        return price;
    }
    
    public int getId(){
        return id;
    }

    public void print(){

        System.out.println("ID:  " + getId()  + "   " + getName());
        System.out.println(", " + getPrice());
        System.out.println("   -- " + getDescription());

    }

    public Iterator createIterator() {
        return new NullIterator();
    }
}