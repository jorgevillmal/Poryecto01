//pending you might have to refactor 

package robot;
import java.util.Scanner;
import robot.*;
public class AttendingState implements State{
    Waitress waitress;
    int static order;
    public AttendingState(Waitress waitress){
        this.waitress = waitress;
    }

    public void doAction(){
        Scanner sc = new Scanner(System.in);
        System.out.println("El mesero esta despertando....");
        System.out.println("Mesero: Gusta que le tome la orden?....");
        System.out.println("Cliente: Por supuesto me muestra el menu?");
        waitress.printMenu();
        
        getOrder();
    }

    private static void getOrder(){
        System.out.println("Mesero: Que opcion le gusto mas? Porfavor escriba el numero de su comida: ");
        order = sc.nextInt();
        //the ids will go from 1 to idk 15
        if(!(order < 0 || order > 15)){
            WalkingState walking = new WalkingState(waitress, order, false);
            waitress.setState(walking);
            waitress.doAction();
        }else{
            System.out.println("Mesero: La id debe ser la de alguna de nuestros productos cheque que la haya elegido bien!");
            getOrder();
        }        
    }
}