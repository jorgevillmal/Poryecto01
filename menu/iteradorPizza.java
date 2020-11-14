package menu;

import java.util.Iterator;

public class iteradorPizza implements Iterator {
    MenuComponent[] items;
    int position = 0;

    public iteradorPizza (MenuComponent[] items){
        this.items = items;
    }

    public Object next() {
        MenuComponent menuItem= items[position];
        position = position +1;
        return menuItem;
    }

    public boolean hasNext(){
        if(position >= items.length  || items[position] == null){
            return false;
        }
        else {
            return true;
        }
    }

}
