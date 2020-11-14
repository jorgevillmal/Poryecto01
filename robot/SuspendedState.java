package robot;
import java.util.Scanner;
import robot.*;

public class SuspendedState implements State{
    Waitress waitress;

    public SuspendedState(Waitress waitress){
        this.waitress = waitress;
    }

    public void doAction(){
        Scanner sc = new Scanner(System.in);
        System.out.println("El mesero esta durmiendo esperando a un cliente...");
        System.out.println("Desea usted entrar a la tienda? esto encendera el robor mesero de enseguida! y/n?");
        String a = sc.nextLine();
        a = a.toLowerCase();
        if(a.equals("y")){
            //Let's activate the waitress
            AttendigState activated = new AttendigState(waitress);
            waitress.setState(activated);
            waitress.doAction();
        }else if(a.equals("n")){
            //The user didn't got inside the store.
            System.out.println("Vuelva en otro momento al restaurante!");
            System.out.println("Cerrando el programa...");
        }else{
            System.out.println("Selecciona \"y\" : para entrar a la tienda y disftrutar los platillos! o \"n\" : tal vez puewdo pasar en otro momento");
            waitress.doAction();
        }
    }
}