package robot;

import menu.MenuComponent;

public class Robot {
    MenuComponent allMenus;

    public Robot(MenuComponent allMenus){
        this.allMenus = allMenus;
    }

    public void printMenu(){
        allMenus.print();
    }
}
