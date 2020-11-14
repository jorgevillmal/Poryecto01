package robot;
import java.util.Scanner;
import robot.*;
public class WalkingState implements State{
    Waitress waitress;
    static int order;
    boolean way;
    public WalkingState(Waitress waitress,int order, boolean way){
        this.order = order;
        this.waitress = waitress;
        this.way = way;
    }
    if(way){
        System.out.println("El robot va caminando de la caja a la cocina...");
        CookingState cooking = new CookingState(waitress, order);
        waitress.setState(cooking);
        waitress.doAction();
    }else{
        System.out.println("El robot va caminando de la cocina a la caja...");
        AttendingState attending = new AttendingState(waitress, order);
            waitress.setState(attending);
            waitress.doAction();
    }
        
    
}